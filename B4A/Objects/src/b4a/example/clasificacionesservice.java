package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class clasificacionesservice extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.clasificacionesservice");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.clasificacionesservice.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public String _apiurl = "";
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _class_globals(b4a.example.clasificacionesservice __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clasificacionesservice";
RDebugUtils.currentLine=10158080;
 //BA.debugLineNum = 10158080;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=10158081;
 //BA.debugLineNum = 10158081;BA.debugLine="Public ApiUrl As String";
_apiurl = "";
RDebugUtils.currentLine=10158082;
 //BA.debugLineNum = 10158082;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _create(b4a.example.clasificacionesservice __ref,b4a.example.clasificacion _clasificacion) throws Exception{
RDebugUtils.currentModule="clasificacionesservice";
if (Debug.shouldDelegate(ba, "create", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "create", new Object[] {_clasificacion}));}
ResumableSub_Create rsub = new ResumableSub_Create(this,__ref,_clasificacion);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Create extends BA.ResumableSub {
public ResumableSub_Create(b4a.example.clasificacionesservice parent,b4a.example.clasificacionesservice __ref,b4a.example.clasificacion _clasificacion) {
this.parent = parent;
this.__ref = __ref;
this._clasificacion = _clasificacion;
this.__ref = parent;
}
b4a.example.clasificacionesservice __ref;
b4a.example.clasificacionesservice parent;
b4a.example.clasificacion _clasificacion;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
b4a.example.httpjob _apijob = null;
b4a.example.httpjob _resultado = null;
anywheresoftware.b4a.objects.collections.JSONParser _jsonparser = null;
anywheresoftware.b4a.objects.collections.Map _map = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="clasificacionesservice";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=13107201;
 //BA.debugLineNum = 13107201;BA.debugLine="Dim json As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=13107202;
 //BA.debugLineNum = 13107202;BA.debugLine="json.Initialize(CreateMap(\"descripcion\": clasific";
_json.Initialize(parent.__c.createMap(new Object[] {(Object)("descripcion"),(Object)(_clasificacion._descripcion /*String*/ )}));
RDebugUtils.currentLine=13107204;
 //BA.debugLineNum = 13107204;BA.debugLine="Dim apijob As HttpJob";
_apijob = new b4a.example.httpjob();
RDebugUtils.currentLine=13107205;
 //BA.debugLineNum = 13107205;BA.debugLine="apijob.Initialize(\"\", Me)";
_apijob._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=13107206;
 //BA.debugLineNum = 13107206;BA.debugLine="apijob.PostString(ApiUrl, json.ToString)";
_apijob._poststring /*String*/ (null,__ref._apiurl /*String*/ ,_json.ToString());
RDebugUtils.currentLine=13107207;
 //BA.debugLineNum = 13107207;BA.debugLine="apijob.GetRequest.SetContentType(\"application/jso";
_apijob._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=13107209;
 //BA.debugLineNum = 13107209;BA.debugLine="Wait For (apijob) JobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "clasificacionesservice", "create"), (Object)(_apijob));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=13107211;
 //BA.debugLineNum = 13107211;BA.debugLine="If resultado.Success = False Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_resultado._success /*boolean*/ ==parent.__c.False) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=13107212;
 //BA.debugLineNum = 13107212;BA.debugLine="Log(\"Error: \" & resultado.ErrorMessage)";
parent.__c.LogImpl("613107212","Error: "+_resultado._errormessage /*String*/ ,0);
RDebugUtils.currentLine=13107213;
 //BA.debugLineNum = 13107213;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=13107216;
 //BA.debugLineNum = 13107216;BA.debugLine="Dim jsonParser As JSONParser";
_jsonparser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=13107217;
 //BA.debugLineNum = 13107217;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
_jsonparser.Initialize(_resultado._getstring /*String*/ (null));
RDebugUtils.currentLine=13107218;
 //BA.debugLineNum = 13107218;BA.debugLine="Dim map As Map = jsonParser.NextObject";
_map = new anywheresoftware.b4a.objects.collections.Map();
_map = _jsonparser.NextObject();
RDebugUtils.currentLine=13107220;
 //BA.debugLineNum = 13107220;BA.debugLine="clasificacion.id = map.Get(\"id\")";
_clasificacion._id /*int*/  = (int)(BA.ObjectToNumber(_map.Get((Object)("id"))));
RDebugUtils.currentLine=13107221;
 //BA.debugLineNum = 13107221;BA.debugLine="clasificacion.descripcion = map.Get(\"descripcion\"";
_clasificacion._descripcion /*String*/  = BA.ObjectToString(_map.Get((Object)("descripcion")));
RDebugUtils.currentLine=13107222;
 //BA.debugLineNum = 13107222;BA.debugLine="Return clasificacion";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_clasificacion));return;};
RDebugUtils.currentLine=13107223;
 //BA.debugLineNum = 13107223;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _delete(b4a.example.clasificacionesservice __ref,int _id) throws Exception{
RDebugUtils.currentModule="clasificacionesservice";
if (Debug.shouldDelegate(ba, "delete", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "delete", new Object[] {_id}));}
ResumableSub_Delete rsub = new ResumableSub_Delete(this,__ref,_id);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Delete extends BA.ResumableSub {
public ResumableSub_Delete(b4a.example.clasificacionesservice parent,b4a.example.clasificacionesservice __ref,int _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this.__ref = parent;
}
b4a.example.clasificacionesservice __ref;
b4a.example.clasificacionesservice parent;
int _id;
b4a.example.httpjob _apijob = null;
b4a.example.httpjob _resultado = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="clasificacionesservice";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=13303809;
 //BA.debugLineNum = 13303809;BA.debugLine="Dim apijob As HttpJob";
_apijob = new b4a.example.httpjob();
RDebugUtils.currentLine=13303810;
 //BA.debugLineNum = 13303810;BA.debugLine="apijob.Initialize(\"\", Me)";
_apijob._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=13303811;
 //BA.debugLineNum = 13303811;BA.debugLine="apijob.Delete(ApiUrl & \"/\" & id)";
_apijob._delete /*String*/ (null,__ref._apiurl /*String*/ +"/"+BA.NumberToString(_id));
RDebugUtils.currentLine=13303812;
 //BA.debugLineNum = 13303812;BA.debugLine="Wait For (apijob) JobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "clasificacionesservice", "delete"), (Object)(_apijob));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=13303814;
 //BA.debugLineNum = 13303814;BA.debugLine="If resultado.Success = False Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_resultado._success /*boolean*/ ==parent.__c.False) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=13303815;
 //BA.debugLineNum = 13303815;BA.debugLine="Log(\"Error: \" & resultado.ErrorMessage)";
parent.__c.LogImpl("613303815","Error: "+_resultado._errormessage /*String*/ ,0);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=13303817;
 //BA.debugLineNum = 13303817;BA.debugLine="Return resultado.Success";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_resultado._success /*boolean*/ ));return;};
RDebugUtils.currentLine=13303818;
 //BA.debugLineNum = 13303818;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _initialize(b4a.example.clasificacionesservice __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="clasificacionesservice";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=10223616;
 //BA.debugLineNum = 10223616;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=10223617;
 //BA.debugLineNum = 10223617;BA.debugLine="ApiUrl = \"https://cloudcomputingapi2.azurewebsite";
__ref._apiurl /*String*/  = "https://cloudcomputingapi2.azurewebsites.net/api/Clasificaciones";
RDebugUtils.currentLine=10223618;
 //BA.debugLineNum = 10223618;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _readbyid(b4a.example.clasificacionesservice __ref,int _id) throws Exception{
RDebugUtils.currentModule="clasificacionesservice";
if (Debug.shouldDelegate(ba, "readbyid", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "readbyid", new Object[] {_id}));}
ResumableSub_ReadById rsub = new ResumableSub_ReadById(this,__ref,_id);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ReadById extends BA.ResumableSub {
public ResumableSub_ReadById(b4a.example.clasificacionesservice parent,b4a.example.clasificacionesservice __ref,int _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this.__ref = parent;
}
b4a.example.clasificacionesservice __ref;
b4a.example.clasificacionesservice parent;
int _id;
b4a.example.clasificacion _clasificacion = null;
b4a.example.httpjob _apijob = null;
b4a.example.httpjob _resultado = null;
anywheresoftware.b4a.objects.collections.JSONParser _jsonparser = null;
anywheresoftware.b4a.objects.collections.Map _map = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="clasificacionesservice";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=13172737;
 //BA.debugLineNum = 13172737;BA.debugLine="Dim clasificacion As Clasificacion";
_clasificacion = new b4a.example.clasificacion();
RDebugUtils.currentLine=13172738;
 //BA.debugLineNum = 13172738;BA.debugLine="clasificacion.Initialize";
_clasificacion._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=13172740;
 //BA.debugLineNum = 13172740;BA.debugLine="Dim apijob As HttpJob";
_apijob = new b4a.example.httpjob();
RDebugUtils.currentLine=13172741;
 //BA.debugLineNum = 13172741;BA.debugLine="apijob.Initialize(\"\", Me)";
_apijob._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=13172742;
 //BA.debugLineNum = 13172742;BA.debugLine="apijob.Download(ApiUrl & \"/\" & id)";
_apijob._download /*String*/ (null,__ref._apiurl /*String*/ +"/"+BA.NumberToString(_id));
RDebugUtils.currentLine=13172743;
 //BA.debugLineNum = 13172743;BA.debugLine="Wait For (apijob) JobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "clasificacionesservice", "readbyid"), (Object)(_apijob));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=13172745;
 //BA.debugLineNum = 13172745;BA.debugLine="If resultado.Success = False Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_resultado._success /*boolean*/ ==parent.__c.False) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=13172746;
 //BA.debugLineNum = 13172746;BA.debugLine="Log(\"Error: \" & resultado.ErrorMessage)";
parent.__c.LogImpl("613172746","Error: "+_resultado._errormessage /*String*/ ,0);
RDebugUtils.currentLine=13172747;
 //BA.debugLineNum = 13172747;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=13172750;
 //BA.debugLineNum = 13172750;BA.debugLine="Dim jsonParser As JSONParser";
_jsonparser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=13172751;
 //BA.debugLineNum = 13172751;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
_jsonparser.Initialize(_resultado._getstring /*String*/ (null));
RDebugUtils.currentLine=13172752;
 //BA.debugLineNum = 13172752;BA.debugLine="Dim map As Map = jsonParser.NextObject";
_map = new anywheresoftware.b4a.objects.collections.Map();
_map = _jsonparser.NextObject();
RDebugUtils.currentLine=13172754;
 //BA.debugLineNum = 13172754;BA.debugLine="clasificacion.id = map.Get(\"id\")";
_clasificacion._id /*int*/  = (int)(BA.ObjectToNumber(_map.Get((Object)("id"))));
RDebugUtils.currentLine=13172755;
 //BA.debugLineNum = 13172755;BA.debugLine="clasificacion.descripcion = map.Get(\"descripcion\"";
_clasificacion._descripcion /*String*/  = BA.ObjectToString(_map.Get((Object)("descripcion")));
RDebugUtils.currentLine=13172757;
 //BA.debugLineNum = 13172757;BA.debugLine="Return clasificacion";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_clasificacion));return;};
RDebugUtils.currentLine=13172758;
 //BA.debugLineNum = 13172758;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _update(b4a.example.clasificacionesservice __ref,int _id,b4a.example.clasificacion _clasificacion) throws Exception{
RDebugUtils.currentModule="clasificacionesservice";
if (Debug.shouldDelegate(ba, "update", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "update", new Object[] {_id,_clasificacion}));}
ResumableSub_Update rsub = new ResumableSub_Update(this,__ref,_id,_clasificacion);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Update extends BA.ResumableSub {
public ResumableSub_Update(b4a.example.clasificacionesservice parent,b4a.example.clasificacionesservice __ref,int _id,b4a.example.clasificacion _clasificacion) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this._clasificacion = _clasificacion;
this.__ref = parent;
}
b4a.example.clasificacionesservice __ref;
b4a.example.clasificacionesservice parent;
int _id;
b4a.example.clasificacion _clasificacion;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
b4a.example.httpjob _apijob = null;
b4a.example.httpjob _resultado = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="clasificacionesservice";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=13238273;
 //BA.debugLineNum = 13238273;BA.debugLine="Dim json As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=13238274;
 //BA.debugLineNum = 13238274;BA.debugLine="json.Initialize(CreateMap(\"id\": clasificacion.id,";
_json.Initialize(parent.__c.createMap(new Object[] {(Object)("id"),(Object)(_clasificacion._id /*int*/ ),(Object)("descripcion"),(Object)(_clasificacion._descripcion /*String*/ )}));
RDebugUtils.currentLine=13238276;
 //BA.debugLineNum = 13238276;BA.debugLine="Dim apijob As HttpJob";
_apijob = new b4a.example.httpjob();
RDebugUtils.currentLine=13238277;
 //BA.debugLineNum = 13238277;BA.debugLine="apijob.Initialize(\"\", Me)";
_apijob._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=13238278;
 //BA.debugLineNum = 13238278;BA.debugLine="apijob.PutString(ApiUrl & \"/\" & id, json.ToString";
_apijob._putstring /*String*/ (null,__ref._apiurl /*String*/ +"/"+BA.NumberToString(_id),_json.ToString());
RDebugUtils.currentLine=13238279;
 //BA.debugLineNum = 13238279;BA.debugLine="apijob.GetRequest.SetContentType(\"application/jso";
_apijob._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=13238281;
 //BA.debugLineNum = 13238281;BA.debugLine="Wait For (apijob) JobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "clasificacionesservice", "update"), (Object)(_apijob));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=13238283;
 //BA.debugLineNum = 13238283;BA.debugLine="If resultado.Success = False Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_resultado._success /*boolean*/ ==parent.__c.False) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=13238284;
 //BA.debugLineNum = 13238284;BA.debugLine="Log(\"Error: \" & resultado.ErrorMessage)";
parent.__c.LogImpl("613238284","Error: "+_resultado._errormessage /*String*/ ,0);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=13238287;
 //BA.debugLineNum = 13238287;BA.debugLine="Return resultado.Success";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_resultado._success /*boolean*/ ));return;};
RDebugUtils.currentLine=13238288;
 //BA.debugLineNum = 13238288;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}