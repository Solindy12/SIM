package kr.kro.solindy.Main;

import kr.kro.solindy.Persistence.persistence;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;


public class main extends JavaPlugin {
    persistence persistence = new persistence();

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player) sender;
        if(cmd.getName().equalsIgnoreCase("지혜지왕")){
            if(p.isOp()) {
                p.getInventory().addItem(persistence.Raphael());
                p.sendMessage(persistence.Raphael().getItemMeta().getDisplayName() + ChatColor.GRAY + " 지속능력을 지급했습니다");
            }
            else {
                p.sendMessage(ChatColor.RED + "권한이 없어 명령을 실행하지 못했습니다");
            }
        }
        else if(cmd.getName().equalsIgnoreCase("유혹지왕")) {
            if(p.isOp()) {
                p.getInventory().addItem(persistence.Azazel());
                p.sendMessage(persistence.Azazel().getItemMeta().getDisplayName() + ChatColor.GRAY + " 지속능력을 지급했습니다");
            }
            else {
                p.sendMessage(ChatColor.RED + "권한이 없어 명령을 실행하지 못했습니다");
            }
        }
        else if(cmd.getName().equalsIgnoreCase("시공지신")) {
            if(p.isOp()) {
                p.getInventory().addItem(persistence.Yog_Sothoth());
                p.sendMessage(persistence.Yog_Sothoth().getItemMeta().getDisplayName() + ChatColor.GRAY + " 지속능력을 지급했습니다");
            }
            else {
                p.sendMessage(ChatColor.RED + "권한이 없어 명령을 실행하지 못했습니다");
            }
        }
        else if(cmd.getName().equalsIgnoreCase("요리인")) {
            if(p.isOp()) {
                p.getInventory().addItem(persistence.Yoriin());
                p.sendMessage(persistence.Yoriin().getItemMeta().getDisplayName() + ChatColor.GRAY + " 지속능력을 지급했습니다");
            }
            else {
                p.sendMessage(ChatColor.RED + "권한이 없어 명령을 실행하지 못했습니다");
            }
        }
        else if(cmd.getName().equalsIgnoreCase("기아자")) {
            if(p.isOp()) {
                p.getInventory().addItem(persistence.Giaja());
                p.sendMessage(persistence.Giaja().getItemMeta().getDisplayName() + ChatColor.GRAY + " 지속능력을 지급했습니다");
            }
            else {
                p.sendMessage(ChatColor.RED + "권한이 없어 명령을 실행하지 못했습니다");
            }
        }
        else if(cmd.getName().equalsIgnoreCase("절단자")) {
            if(p.isOp()) {
                p.getInventory().addItem(persistence.Jeoldanja());
                p.sendMessage(persistence.Jeoldanja().getItemMeta().getDisplayName() + ChatColor.GRAY + " 지속능력을 지급했습니다");
            }
            else {
                p.sendMessage(ChatColor.RED + "권한이 없어 명령을 실행하지 못했습니다");
            }
        }
        else if(cmd.getName().equalsIgnoreCase("심연바이러스")) {
            if(p.isOp()) {
                p.getInventory().addItem(persistence.Simyeonvirus());
                p.sendMessage(persistence.Simyeonvirus().getItemMeta().getDisplayName() + ChatColor.GRAY + " 지속능력을 지급했습니다");
            }
            else {
                p.sendMessage(ChatColor.RED + "권한이 없어 명령을 실행하지 못했습니다");
            }
        }
        else if(cmd.getName().equalsIgnoreCase("클로노아의초시계")) {
            if(p.isOp()) {
                p.getInventory().addItem(persistence.Clonoastopwatch());
                p.sendMessage(persistence.Clonoastopwatch().getItemMeta().getDisplayName() + ChatColor.GRAY + " 지속능력을 지급했습니다");
            }
            else {
                p.sendMessage(ChatColor.RED + "권한이 없어 명령을 실행하지 못했습니다");
            }
        }
        return true;
    }
}