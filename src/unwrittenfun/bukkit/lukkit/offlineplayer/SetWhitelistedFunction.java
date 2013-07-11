package unwrittenfun.bukkit.lukkit.offlineplayer;

import org.luaj.vm2.LuaValue;
import org.luaj.vm2.Varargs;
import org.luaj.vm2.lib.VarArgFunction;


public class SetWhitelistedFunction extends VarArgFunction {

	@Override
	public Varargs invoke(Varargs args) {
		((OfflinePlayerObject) args.arg(1)).offlineplayer.setWhitelisted(args.toboolean(2));
		return LuaValue.NIL;
	}
	
}
