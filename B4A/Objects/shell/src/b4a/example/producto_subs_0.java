package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class producto_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public id As Int";
producto._id = RemoteObject.createImmutable(0);__ref.setField("_id",producto._id);
 //BA.debugLineNum = 3;BA.debugLine="Public nombre As String";
producto._nombre = RemoteObject.createImmutable("");__ref.setField("_nombre",producto._nombre);
 //BA.debugLineNum = 4;BA.debugLine="Public existencia As Int";
producto._existencia = RemoteObject.createImmutable(0);__ref.setField("_existencia",producto._existencia);
 //BA.debugLineNum = 5;BA.debugLine="Public precioUnitario As Int";
producto._preciounitario = RemoteObject.createImmutable(0);__ref.setField("_preciounitario",producto._preciounitario);
 //BA.debugLineNum = 6;BA.debugLine="Public iva As Int";
producto._iva = RemoteObject.createImmutable(0);__ref.setField("_iva",producto._iva);
 //BA.debugLineNum = 7;BA.debugLine="Public clasificacionId As Int";
producto._clasificacionid = RemoteObject.createImmutable(0);__ref.setField("_clasificacionid",producto._clasificacionid);
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (producto) ","producto",3,__ref.getField(false, "ba"),__ref,11);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "producto","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(1024);
 BA.debugLineNum = 13;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}