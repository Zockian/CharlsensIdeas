package charlsen.charlsens.ideas.tools.Bornite;

import charlsen.charlsens.ideas.CharlsensideasTools;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;


public class BorniteSwordMaterial implements ToolMaterial {
    @Override
    public int getDurability() {
        return 1200;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 1.0F;
    }

    @Override
    public float getAttackDamage() {
        return 10.0F;
    }

    @Override
    public int getMiningLevel() {
        return 5;
    }

    @Override
    public int getEnchantability() {
        return 20;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(CharlsensideasTools.Bornite_Sword);
    }

    public static final BorniteSwordMaterial INSTANCEBOSWORD = new BorniteSwordMaterial();

}
