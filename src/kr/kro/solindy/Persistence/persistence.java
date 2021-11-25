package kr.kro.solindy.Persistence;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;

public class persistence extends JavaPlugin {

    public ItemStack Raphael(){

        ItemStack I = new ItemStack(Material.YELLOW_DYE);
        ItemMeta IM = I.getItemMeta();
        IM.setDisplayName(ChatColor.GOLD + "지혜지왕");
        ArrayList<String> IL = new ArrayList<String>();
        IL.add("");
        IL.add(ChatColor.GRAY + "상대방에게 피격될 시 " + ChatColor.GREEN + "5% " + ChatColor.GRAY + "확률로");
        IL.add(ChatColor.GRAY + "즉사 효과로 인한 피해를 제외한 모든 피해를 " + ChatColor.AQUA + "회피" + ChatColor.GRAY + "합니다.");
        IM.setLore(IL);
        I.setItemMeta(IM);

        return I;

    }

    public ItemStack Azazel() {

        ItemStack I = new ItemStack(Material.YELLOW_DYE);
        ItemMeta IM = I.getItemMeta();
        IM.setDisplayName(ChatColor.RED + "유혹지왕");
        ArrayList<String> IL = new ArrayList<String>();
        IL.add("");
        IL.add(ChatColor.GRAY + "상대방에게 받은 피해가 " + ChatColor.RED + "1❤ " + ChatColor.GRAY + "이하일 시");
        IL.add(ChatColor.GRAY + "상대방의 아이템 중 하나를 무작위로 " + ChatColor.AQUA + "삭제" + ChatColor.GRAY + "합니다.");
        IM.setLore(IL);
        I.setItemMeta(IM);

        return I;

    }

    public ItemStack Yog_Sothoth() {

        ItemStack I = new ItemStack(Material.YELLOW_DYE);
        ItemMeta IM = I.getItemMeta();
        IM.setDisplayName(ChatColor.YELLOW + "시공지신");
        ArrayList<String> IL = new ArrayList<String>();
        IL.add("");
        IL.add(ChatColor.DARK_RED + "단 한 번, " + ChatColor.GRAY + "사망에 이르는 모든 피해를 " + ChatColor.AQUA + "회피" + ChatColor.GRAY + "하며, ");
        IL.add(ChatColor.RED + "10❤" + ChatColor.GRAY + "의 체력을 " + ChatColor.AQUA + "회복" + ChatColor.GRAY + "합니다.");
        IM.setLore(IL);
        I.setItemMeta(IM);

        return I;

    }

    public ItemStack Yoriin() {

        ItemStack I = new ItemStack(Material.YELLOW_DYE);
        ItemMeta IM = I.getItemMeta();
        IM.setDisplayName(ChatColor.LIGHT_PURPLE + "요리인");
        ArrayList<String> IL = new ArrayList<String>();
        IL.add("");
        IL.add(ChatColor.GRAY + "상태이상에 걸릴 시 " + ChatColor.GREEN + "30% " + ChatColor.GRAY + "확률로");
        IL.add(ChatColor.GRAY + "모든 상태이상을 " + ChatColor.AQUA + "해제" + ChatColor.GRAY + "합니다.");
        IM.setLore(IL);
        I.setItemMeta(IM);

        return I;

    }

    public ItemStack Giaja() {

        ItemStack I = new ItemStack(Material.YELLOW_DYE);
        ItemMeta IM = I.getItemMeta();
        IM.setDisplayName(ChatColor.BLACK + "기아자");
        ArrayList<String> IL = new ArrayList<String>();
        IL.add("");
        IL.add(ChatColor.GRAY + "상대방 처치 시 " + ChatColor.GREEN + "5% " + ChatColor.GRAY + "확률로");
        IL.add(ChatColor.GRAY + "상대방의 모든 " + ChatColor.YELLOW + "지속능력, 스킬을 " + ChatColor.AQUA + "지급" + ChatColor.GRAY + "받습니다.");
        IM.setLore(IL);
        I.setItemMeta(IM);

        return I;

    }

    public ItemStack Jeoldanja() {

        ItemStack I = new ItemStack(Material.YELLOW_DYE);
        ItemMeta IM = I.getItemMeta();
        IM.setDisplayName(ChatColor.GRAY + "절단자");
        ArrayList<String> IL = new ArrayList<String>();
        IL.add("");
        IL.add(ChatColor.GRAY + "상대방 피격 시 " + ChatColor.GREEN + "1% " + ChatColor.GRAY + "확률로");
        IL.add(ChatColor.GRAY + "상대방을 " + ChatColor.DARK_RED + "즉사" + ChatColor.GRAY + "시킵니다.");
        IM.setLore(IL);
        I.setItemMeta(IM);

        return I;

    }

    public ItemStack Simyeonvirus() {

        ItemStack I = new ItemStack(Material.YELLOW_DYE);
        ItemMeta IM = I.getItemMeta();
        IM.setDisplayName(ChatColor.DARK_GREEN + "심연 바이러스");
        ArrayList<String> IL = new ArrayList<String>();
        IL.add("");
        IL.add(ChatColor.GRAY + "상대방 피격 시 " + ChatColor.GREEN + "30% " + ChatColor.GRAY + "확률로");
        IL.add(ChatColor.GRAY + "전체 대미지의 " + ChatColor.GREEN + "20% " + ChatColor.GRAY + "추가 피해를 입힙니다.");
        IM.setLore(IL);
        I.setItemMeta(IM);

        return I;

    }

    public ItemStack Clonoastopwatch() {

        ItemStack I = new ItemStack(Material.YELLOW_DYE);
        ItemMeta IM = I.getItemMeta();
        IM.setDisplayName(ChatColor.GOLD + "클로노아의 초시계");
        ArrayList<String> IL = new ArrayList<String>();
        IL.add("");
        IL.add(ChatColor.GRAY + "스킬 사용 시 " + ChatColor.GREEN + "20% " + ChatColor.GRAY + "확률로");
        IL.add(ChatColor.GRAY + "사용한 " + ChatColor.DARK_PURPLE + "마소" + ChatColor.GRAY + "가 " + ChatColor.AQUA + "회복" + ChatColor.GRAY + "됩니다.");
        IM.setLore(IL);
        I.setItemMeta(IM);

        return I;

    }
}
