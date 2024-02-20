package mixin;

import net.minecraft.client.render.WorldRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(WorldRenderer.class)
public class NoOutlineMixin {
	@Inject(method = "drawBlockOutline", at = @At("HEAD"), cancellable = true)
	private void cancelOutline(CallbackInfo ci) {
		ci.cancel();
	}
}