package net.mcreator.testmod;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

@Elementstestmod.ModElement.Tag
public class MCreatorEndobsidianswordsMobIsHitWithItem extends Elementstestmod.ModElement {
	public MCreatorEndobsidianswordsMobIsHitWithItem(Elementstestmod instance) {
		super(instance, 13);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorEndobsidianswordsMobIsHitWithItem!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.GENERIC, (float) 4);
	}
}
