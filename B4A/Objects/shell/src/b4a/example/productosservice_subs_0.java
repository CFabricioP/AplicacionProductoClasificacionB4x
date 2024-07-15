package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class productosservice_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public ApiUrl As String";
productosservice._apiurl = RemoteObject.createImmutable("");__ref.setField("_apiurl",productosservice._apiurl);
 //BA.debugLineNum = 3;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _create(RemoteObject __ref,RemoteObject _producto) throws Exception{
try {
		Debug.PushSubsStack("Create (productosservice) ","productosservice",6,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("create")) { return __ref.runUserSub(false, "productosservice","create", __ref, _producto);}
ResumableSub_Create rsub = new ResumableSub_Create(null,__ref,_producto);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Create extends BA.ResumableSub {
public ResumableSub_Create(b4a.example.productosservice parent,RemoteObject __ref,RemoteObject _producto) {
this.parent = parent;
this.__ref = __ref;
this._producto = _producto;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.productosservice parent;
RemoteObject _producto;
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
RemoteObject _apijob = RemoteObject.declareNull("b4a.example.httpjob");
RemoteObject _resultado = RemoteObject.declareNull("b4a.example.httpjob");
RemoteObject _jsonparser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Create (productosservice) ","productosservice",6,__ref.getField(false, "ba"),__ref,10);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("producto", _producto);
 BA.debugLineNum = 11;BA.debugLine="Dim json As JSONGenerator";
Debug.ShouldStop(1024);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("json", _json);
 BA.debugLineNum = 12;BA.debugLine="json.Initialize(CreateMap(\"nombre\": producto.nomb";
Debug.ShouldStop(2048);
_json.runVoidMethod ("Initialize",(Object)(parent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("nombre")),(_producto.getField(true,"_nombre" /*RemoteObject*/ )),RemoteObject.createImmutable(("existencia")),(_producto.getField(true,"_existencia" /*RemoteObject*/ )),RemoteObject.createImmutable(("precioUnitario")),(_producto.getField(true,"_preciounitario" /*RemoteObject*/ )),RemoteObject.createImmutable(("iva")),(_producto.getField(true,"_iva" /*RemoteObject*/ )),RemoteObject.createImmutable(("clasificacionId")),(_producto.getField(true,"_clasificacionid" /*RemoteObject*/ ))}))));
 BA.debugLineNum = 14;BA.debugLine="Dim apijob As HttpJob";
Debug.ShouldStop(8192);
_apijob = RemoteObject.createNew ("b4a.example.httpjob");Debug.locals.put("apijob", _apijob);
 BA.debugLineNum = 15;BA.debugLine="apijob.Initialize(\"\", Me)";
Debug.ShouldStop(16384);
_apijob.runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 16;BA.debugLine="apijob.PostString(ApiUrl, json.ToString)";
Debug.ShouldStop(32768);
_apijob.runClassMethod (b4a.example.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_apiurl" /*RemoteObject*/ )),(Object)(_json.runMethod(true,"ToString")));
 BA.debugLineNum = 17;BA.debugLine="apijob.GetRequest.SetContentType(\"application/jso";
Debug.ShouldStop(65536);
_apijob.runClassMethod (b4a.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 19;BA.debugLine="Wait For (apijob) JobDone(resultado As HttpJob)";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "productosservice", "create"), (_apijob));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resultado = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resultado", _resultado);
;
 BA.debugLineNum = 21;BA.debugLine="If resultado.Success = False Then";
Debug.ShouldStop(1048576);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_resultado.getField(true,"_success" /*RemoteObject*/ ),parent.__c.getField(true,"False"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 22;BA.debugLine="Log(\"Error: \" & resultado.ErrorMessage)";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("LogImpl","610420236",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_resultado.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 BA.debugLineNum = 23;BA.debugLine="Return Null";
Debug.ShouldStop(4194304);
Debug.CheckDeviceExceptions();if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 26;BA.debugLine="Dim jsonParser As JSONParser";
Debug.ShouldStop(33554432);
_jsonparser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("jsonParser", _jsonparser);
 BA.debugLineNum = 27;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
Debug.ShouldStop(67108864);
_jsonparser.runVoidMethod ("Initialize",(Object)(_resultado.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 28;BA.debugLine="Dim map As Map = jsonParser.NextObject";
Debug.ShouldStop(134217728);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_map = _jsonparser.runMethod(false,"NextObject");Debug.locals.put("map", _map);Debug.locals.put("map", _map);
 BA.debugLineNum = 30;BA.debugLine="producto.id = map.Get(\"id\")";
Debug.ShouldStop(536870912);
_producto.setField ("_id" /*RemoteObject*/ ,BA.numberCast(int.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))));
 BA.debugLineNum = 31;BA.debugLine="producto.nombre = map.Get(\"nombre\")";
Debug.ShouldStop(1073741824);
_producto.setField ("_nombre" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("nombre"))))));
 BA.debugLineNum = 32;BA.debugLine="producto.existencia = map.Get(\"existencia\")";
Debug.ShouldStop(-2147483648);
_producto.setField ("_existencia" /*RemoteObject*/ ,BA.numberCast(int.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("existencia"))))));
 BA.debugLineNum = 33;BA.debugLine="producto.precioUnitario = map.Get(\"precioUnitario";
Debug.ShouldStop(1);
_producto.setField ("_preciounitario" /*RemoteObject*/ ,BA.numberCast(int.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("precioUnitario"))))));
 BA.debugLineNum = 34;BA.debugLine="producto.iva = map.Get(\"iva\")";
Debug.ShouldStop(2);
_producto.setField ("_iva" /*RemoteObject*/ ,BA.numberCast(int.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("iva"))))));
 BA.debugLineNum = 35;BA.debugLine="producto.clasificacionId = map.Get(\"clasificacion";
Debug.ShouldStop(4);
_producto.setField ("_clasificacionid" /*RemoteObject*/ ,BA.numberCast(int.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("clasificacionId"))))));
 BA.debugLineNum = 36;BA.debugLine="Return producto";
Debug.ShouldStop(8);
Debug.CheckDeviceExceptions();if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_producto));return;};
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _jobdone(RemoteObject __ref,RemoteObject _resultado) throws Exception{
}
public static RemoteObject  _delete(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("Delete (productosservice) ","productosservice",6,__ref.getField(false, "ba"),__ref,85);
if (RapidSub.canDelegate("delete")) { return __ref.runUserSub(false, "productosservice","delete", __ref, _id);}
ResumableSub_Delete rsub = new ResumableSub_Delete(null,__ref,_id);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Delete extends BA.ResumableSub {
public ResumableSub_Delete(b4a.example.productosservice parent,RemoteObject __ref,RemoteObject _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.productosservice parent;
RemoteObject _id;
RemoteObject _apijob = RemoteObject.declareNull("b4a.example.httpjob");
RemoteObject _resultado = RemoteObject.declareNull("b4a.example.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Delete (productosservice) ","productosservice",6,__ref.getField(false, "ba"),__ref,85);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("id", _id);
 BA.debugLineNum = 86;BA.debugLine="Dim apijob As HttpJob";
Debug.ShouldStop(2097152);
_apijob = RemoteObject.createNew ("b4a.example.httpjob");Debug.locals.put("apijob", _apijob);
 BA.debugLineNum = 87;BA.debugLine="apijob.Initialize(\"\", Me)";
Debug.ShouldStop(4194304);
_apijob.runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 88;BA.debugLine="apijob.Delete(ApiUrl & \"/\" & id)";
Debug.ShouldStop(8388608);
_apijob.runClassMethod (b4a.example.httpjob.class, "_delete" /*RemoteObject*/ ,(Object)(RemoteObject.concat(__ref.getField(true,"_apiurl" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),_id)));
 BA.debugLineNum = 89;BA.debugLine="Wait For (apijob) JobDone(resultado As HttpJob)";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "productosservice", "delete"), (_apijob));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resultado = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resultado", _resultado);
;
 BA.debugLineNum = 91;BA.debugLine="If resultado.Success = False Then";
Debug.ShouldStop(67108864);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_resultado.getField(true,"_success" /*RemoteObject*/ ),parent.__c.getField(true,"False"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 92;BA.debugLine="Log(\"Error: \" & resultado.ErrorMessage)";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("LogImpl","610616839",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_resultado.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 95;BA.debugLine="Return resultado.Success";
Debug.ShouldStop(1073741824);
Debug.CheckDeviceExceptions();if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_resultado.getField(true,"_success" /*RemoteObject*/ )));return;};
 BA.debugLineNum = 96;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (productosservice) ","productosservice",6,__ref.getField(false, "ba"),__ref,6);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "productosservice","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 6;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(32);
 BA.debugLineNum = 7;BA.debugLine="ApiUrl =\"https://cloudcomputingapi2.azurewebsites";
Debug.ShouldStop(64);
__ref.setField ("_apiurl" /*RemoteObject*/ ,BA.ObjectToString("https://cloudcomputingapi2.azurewebsites.net/api/Productos"));
 BA.debugLineNum = 8;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _readbyid(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("ReadById (productosservice) ","productosservice",6,__ref.getField(false, "ba"),__ref,39);
if (RapidSub.canDelegate("readbyid")) { return __ref.runUserSub(false, "productosservice","readbyid", __ref, _id);}
ResumableSub_ReadById rsub = new ResumableSub_ReadById(null,__ref,_id);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ReadById extends BA.ResumableSub {
public ResumableSub_ReadById(b4a.example.productosservice parent,RemoteObject __ref,RemoteObject _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.productosservice parent;
RemoteObject _id;
RemoteObject _producto = RemoteObject.declareNull("b4a.example.producto");
RemoteObject _apijob = RemoteObject.declareNull("b4a.example.httpjob");
RemoteObject _resultado = RemoteObject.declareNull("b4a.example.httpjob");
RemoteObject _jsonparser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ReadById (productosservice) ","productosservice",6,__ref.getField(false, "ba"),__ref,39);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("id", _id);
 BA.debugLineNum = 40;BA.debugLine="Dim producto As Producto";
Debug.ShouldStop(128);
_producto = RemoteObject.createNew ("b4a.example.producto");Debug.locals.put("producto", _producto);
 BA.debugLineNum = 41;BA.debugLine="producto.Initialize";
Debug.ShouldStop(256);
_producto.runClassMethod (b4a.example.producto.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 43;BA.debugLine="Dim apijob As HttpJob";
Debug.ShouldStop(1024);
_apijob = RemoteObject.createNew ("b4a.example.httpjob");Debug.locals.put("apijob", _apijob);
 BA.debugLineNum = 44;BA.debugLine="apijob.Initialize(\"\", Me)";
Debug.ShouldStop(2048);
_apijob.runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 45;BA.debugLine="apijob.Download(ApiUrl & \"/\" & id)";
Debug.ShouldStop(4096);
_apijob.runClassMethod (b4a.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.concat(__ref.getField(true,"_apiurl" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),_id)));
 BA.debugLineNum = 46;BA.debugLine="Wait For (apijob) JobDone(resultado As HttpJob)";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "productosservice", "readbyid"), (_apijob));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resultado = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resultado", _resultado);
;
 BA.debugLineNum = 48;BA.debugLine="If resultado.Success = False Then";
Debug.ShouldStop(32768);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_resultado.getField(true,"_success" /*RemoteObject*/ ),parent.__c.getField(true,"False"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 49;BA.debugLine="Log(\"Error: \" & resultado.ErrorMessage)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("LogImpl","610485770",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_resultado.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 BA.debugLineNum = 50;BA.debugLine="Return Null";
Debug.ShouldStop(131072);
Debug.CheckDeviceExceptions();if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 53;BA.debugLine="Dim jsonParser As JSONParser";
Debug.ShouldStop(1048576);
_jsonparser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("jsonParser", _jsonparser);
 BA.debugLineNum = 54;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
Debug.ShouldStop(2097152);
_jsonparser.runVoidMethod ("Initialize",(Object)(_resultado.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 55;BA.debugLine="Dim map As Map = jsonParser.NextObject";
Debug.ShouldStop(4194304);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_map = _jsonparser.runMethod(false,"NextObject");Debug.locals.put("map", _map);Debug.locals.put("map", _map);
 BA.debugLineNum = 57;BA.debugLine="producto.id = map.Get(\"id\")";
Debug.ShouldStop(16777216);
_producto.setField ("_id" /*RemoteObject*/ ,BA.numberCast(int.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))));
 BA.debugLineNum = 58;BA.debugLine="producto.nombre = map.Get(\"nombre\")";
Debug.ShouldStop(33554432);
_producto.setField ("_nombre" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("nombre"))))));
 BA.debugLineNum = 59;BA.debugLine="producto.existencia = map.Get(\"existencia\")";
Debug.ShouldStop(67108864);
_producto.setField ("_existencia" /*RemoteObject*/ ,BA.numberCast(int.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("existencia"))))));
 BA.debugLineNum = 60;BA.debugLine="producto.precioUnitario = map.Get(\"precioUnitario";
Debug.ShouldStop(134217728);
_producto.setField ("_preciounitario" /*RemoteObject*/ ,BA.numberCast(int.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("precioUnitario"))))));
 BA.debugLineNum = 61;BA.debugLine="producto.iva = map.Get(\"iva\")";
Debug.ShouldStop(268435456);
_producto.setField ("_iva" /*RemoteObject*/ ,BA.numberCast(int.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("iva"))))));
 BA.debugLineNum = 62;BA.debugLine="producto.clasificacionId = map.Get(\"clasificacion";
Debug.ShouldStop(536870912);
_producto.setField ("_clasificacionid" /*RemoteObject*/ ,BA.numberCast(int.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("clasificacionId"))))));
 BA.debugLineNum = 64;BA.debugLine="Return producto";
Debug.ShouldStop(-2147483648);
Debug.CheckDeviceExceptions();if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_producto));return;};
 BA.debugLineNum = 65;BA.debugLine="End Sub";
Debug.ShouldStop(1);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _update(RemoteObject __ref,RemoteObject _id,RemoteObject _producto) throws Exception{
try {
		Debug.PushSubsStack("Update (productosservice) ","productosservice",6,__ref.getField(false, "ba"),__ref,67);
if (RapidSub.canDelegate("update")) { return __ref.runUserSub(false, "productosservice","update", __ref, _id, _producto);}
ResumableSub_Update rsub = new ResumableSub_Update(null,__ref,_id,_producto);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Update extends BA.ResumableSub {
public ResumableSub_Update(b4a.example.productosservice parent,RemoteObject __ref,RemoteObject _id,RemoteObject _producto) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this._producto = _producto;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.productosservice parent;
RemoteObject _id;
RemoteObject _producto;
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
RemoteObject _apijob = RemoteObject.declareNull("b4a.example.httpjob");
RemoteObject _resultado = RemoteObject.declareNull("b4a.example.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Update (productosservice) ","productosservice",6,__ref.getField(false, "ba"),__ref,67);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("id", _id);
Debug.locals.put("producto", _producto);
 BA.debugLineNum = 68;BA.debugLine="Dim json As JSONGenerator";
Debug.ShouldStop(8);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("json", _json);
 BA.debugLineNum = 69;BA.debugLine="json.Initialize(CreateMap(\"id\": producto.id, \"nom";
Debug.ShouldStop(16);
_json.runVoidMethod ("Initialize",(Object)(parent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("id")),(_producto.getField(true,"_id" /*RemoteObject*/ )),RemoteObject.createImmutable(("nombre")),(_producto.getField(true,"_nombre" /*RemoteObject*/ )),RemoteObject.createImmutable(("existencia")),(_producto.getField(true,"_existencia" /*RemoteObject*/ )),RemoteObject.createImmutable(("precioUnitario")),(_producto.getField(true,"_preciounitario" /*RemoteObject*/ )),RemoteObject.createImmutable(("iva")),(_producto.getField(true,"_iva" /*RemoteObject*/ )),RemoteObject.createImmutable(("clasificacionId")),(_producto.getField(true,"_clasificacionid" /*RemoteObject*/ ))}))));
 BA.debugLineNum = 71;BA.debugLine="Dim apijob As HttpJob";
Debug.ShouldStop(64);
_apijob = RemoteObject.createNew ("b4a.example.httpjob");Debug.locals.put("apijob", _apijob);
 BA.debugLineNum = 72;BA.debugLine="apijob.Initialize(\"\", Me)";
Debug.ShouldStop(128);
_apijob.runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 73;BA.debugLine="apijob.PutString(ApiUrl & \"/\" & id, json.ToString";
Debug.ShouldStop(256);
_apijob.runClassMethod (b4a.example.httpjob.class, "_putstring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(__ref.getField(true,"_apiurl" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),_id)),(Object)(_json.runMethod(true,"ToString")));
 BA.debugLineNum = 74;BA.debugLine="apijob.GetRequest.SetContentType(\"application/jso";
Debug.ShouldStop(512);
_apijob.runClassMethod (b4a.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 76;BA.debugLine="Wait For (apijob) JobDone(resultado As HttpJob)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "productosservice", "update"), (_apijob));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resultado = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resultado", _resultado);
;
 BA.debugLineNum = 78;BA.debugLine="If resultado.Success = False Then";
Debug.ShouldStop(8192);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_resultado.getField(true,"_success" /*RemoteObject*/ ),parent.__c.getField(true,"False"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 79;BA.debugLine="Log(\"Error: \" & resultado.ErrorMessage)";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("LogImpl","610551308",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_resultado.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 82;BA.debugLine="Return resultado.Success";
Debug.ShouldStop(131072);
Debug.CheckDeviceExceptions();if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_resultado.getField(true,"_success" /*RemoteObject*/ )));return;};
 BA.debugLineNum = 83;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
}