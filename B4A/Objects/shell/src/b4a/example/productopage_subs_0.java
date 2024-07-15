package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class productopage_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (productopage) ","productopage",8,__ref.getField(false, "ba"),__ref,19);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "productopage","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 19;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 20;BA.debugLine="Root = Root1";
Debug.ShouldStop(524288);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 22;BA.debugLine="Root.LoadLayout(\"ProductoPage\")";
Debug.ShouldStop(2097152);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("ProductoPage")),__ref.getField(false, "ba"));
 BA.debugLineNum = 24;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btndelete_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnDelete_Click (productopage) ","productopage",8,__ref.getField(false, "ba"),__ref,48);
if (RapidSub.canDelegate("btndelete_click")) { __ref.runUserSub(false, "productopage","btndelete_click", __ref); return;}
ResumableSub_btnDelete_Click rsub = new ResumableSub_btnDelete_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnDelete_Click extends BA.ResumableSub {
public ResumableSub_btnDelete_Click(b4a.example.productopage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.productopage parent;
RemoteObject _success = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnDelete_Click (productopage) ","productopage",8,__ref.getField(false, "ba"),__ref,48);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 49;BA.debugLine="Try";
Debug.ShouldStop(65536);
if (true) break;

case 1:
//try
this.state = 12;
this.catchState = 11;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 11;
 BA.debugLineNum = 50;BA.debugLine="Wait For (productosService.Delete(txtId.Text)) C";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "productopage", "btndelete_click"), __ref.getField(false,"_productosservice" /*RemoteObject*/ ).runClassMethod (b4a.example.productosservice.class, "_delete" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText")))));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("success", _success);
;
 BA.debugLineNum = 51;BA.debugLine="If success Then";
Debug.ShouldStop(262144);
if (true) break;

case 4:
//if
this.state = 9;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 52;BA.debugLine="txtId.Text = \"\"";
Debug.ShouldStop(524288);
__ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 53;BA.debugLine="txtNombre.Text = \"\"";
Debug.ShouldStop(1048576);
__ref.getField(false,"_txtnombre" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 54;BA.debugLine="txtExistencia.Text = \"\"";
Debug.ShouldStop(2097152);
__ref.getField(false,"_txtexistencia" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 55;BA.debugLine="txtPrecioUnitario.Text = \"\"";
Debug.ShouldStop(4194304);
__ref.getField(false,"_txtpreciounitario" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 56;BA.debugLine="txtIva.Text = \"\"";
Debug.ShouldStop(8388608);
__ref.getField(false,"_txtiva" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 57;BA.debugLine="txtClasificacionId.Text = \"\"";
Debug.ShouldStop(16777216);
__ref.getField(false,"_txtclasificacionid" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 59;BA.debugLine="Msgbox(\"Eliminación Exitosa\",\"Éxito\")";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Eliminación Exitosa")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Éxito"))),__ref.getField(false, "ba"));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 61;BA.debugLine="Msgbox(\"No se encontró el registro\",\"Error\")";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No se encontró el registro")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;

case 9:
//C
this.state = 12;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
 BA.debugLineNum = 65;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("LogImpl","614090257",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 BA.debugLineNum = 66;BA.debugLine="Msgbox(\"Error\",\"Error\")";
Debug.ShouldStop(2);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Error")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 69;BA.debugLine="End Sub";
Debug.ShouldStop(16);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e0.toString());}
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
public static void  _complete(RemoteObject __ref,RemoteObject _success) throws Exception{
}
public static void  _btnread_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnRead_Click (productopage) ","productopage",8,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("btnread_click")) { __ref.runUserSub(false, "productopage","btnread_click", __ref); return;}
ResumableSub_btnRead_Click rsub = new ResumableSub_btnRead_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnRead_Click extends BA.ResumableSub {
public ResumableSub_btnRead_Click(b4a.example.productopage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.productopage parent;
RemoteObject _producto = RemoteObject.declareNull("b4a.example.producto");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnRead_Click (productopage) ","productopage",8,__ref.getField(false, "ba"),__ref,26);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 27;BA.debugLine="Try";
Debug.ShouldStop(67108864);
if (true) break;

case 1:
//try
this.state = 12;
this.catchState = 11;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 11;
 BA.debugLineNum = 28;BA.debugLine="Wait For (productosService.ReadById(txtId.Text))";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "productopage", "btnread_click"), __ref.getField(false,"_productosservice" /*RemoteObject*/ ).runClassMethod (b4a.example.productosservice.class, "_readbyid" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText")))));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_producto = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("producto", _producto);
;
 BA.debugLineNum = 30;BA.debugLine="If producto.id <> 0 Then";
Debug.ShouldStop(536870912);
if (true) break;

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean("!",_producto.getField(true,"_id" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 31;BA.debugLine="txtId.Text = producto.id";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_producto.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 32;BA.debugLine="txtNombre.Text = producto.nombre";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_txtnombre" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_producto.getField(true,"_nombre" /*RemoteObject*/ )));
 BA.debugLineNum = 33;BA.debugLine="txtExistencia.Text = producto.existencia";
Debug.ShouldStop(1);
__ref.getField(false,"_txtexistencia" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_producto.getField(true,"_existencia" /*RemoteObject*/ )));
 BA.debugLineNum = 34;BA.debugLine="txtPrecioUnitario.Text = producto.precioUnitari";
Debug.ShouldStop(2);
__ref.getField(false,"_txtpreciounitario" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_producto.getField(true,"_preciounitario" /*RemoteObject*/ )));
 BA.debugLineNum = 35;BA.debugLine="txtIva.Text = producto.iva";
Debug.ShouldStop(4);
__ref.getField(false,"_txtiva" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_producto.getField(true,"_iva" /*RemoteObject*/ )));
 BA.debugLineNum = 36;BA.debugLine="txtClasificacionId.Text = producto.clasificacio";
Debug.ShouldStop(8);
__ref.getField(false,"_txtclasificacionid" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_producto.getField(true,"_clasificacionid" /*RemoteObject*/ )));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 38;BA.debugLine="Msgbox(\"No hay datos\",\"Error\")";
Debug.ShouldStop(32);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No hay datos")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;

case 9:
//C
this.state = 12;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
 BA.debugLineNum = 42;BA.debugLine="Log(LastException)";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("LogImpl","614024720",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 BA.debugLineNum = 43;BA.debugLine="Msgbox(\"No hay datos\",\"Error\")";
Debug.ShouldStop(1024);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No hay datos")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e0.toString());}
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
public static void  _btnsave_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnSave_Click (productopage) ","productopage",8,__ref.getField(false, "ba"),__ref,95);
if (RapidSub.canDelegate("btnsave_click")) { __ref.runUserSub(false, "productopage","btnsave_click", __ref); return;}
ResumableSub_btnSave_Click rsub = new ResumableSub_btnSave_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnSave_Click extends BA.ResumableSub {
public ResumableSub_btnSave_Click(b4a.example.productopage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.productopage parent;
RemoteObject _productotocreate = RemoteObject.declareNull("b4a.example.producto");
RemoteObject _productoresult = RemoteObject.declareNull("b4a.example.producto");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnSave_Click (productopage) ","productopage",8,__ref.getField(false, "ba"),__ref,95);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 96;BA.debugLine="Try";
Debug.ShouldStop(-2147483648);
if (true) break;

case 1:
//try
this.state = 12;
this.catchState = 11;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 11;
 BA.debugLineNum = 97;BA.debugLine="Dim productoToCreate As Producto";
Debug.ShouldStop(1);
_productotocreate = RemoteObject.createNew ("b4a.example.producto");Debug.locals.put("productoToCreate", _productotocreate);
 BA.debugLineNum = 99;BA.debugLine="productoToCreate.nombre = txtNombre.Text";
Debug.ShouldStop(4);
_productotocreate.setField ("_nombre" /*RemoteObject*/ ,__ref.getField(false,"_txtnombre" /*RemoteObject*/ ).runMethod(true,"getText"));
 BA.debugLineNum = 100;BA.debugLine="productoToCreate.existencia = txtExistencia.Text";
Debug.ShouldStop(8);
_productotocreate.setField ("_existencia" /*RemoteObject*/ ,BA.numberCast(int.class, __ref.getField(false,"_txtexistencia" /*RemoteObject*/ ).runMethod(true,"getText")));
 BA.debugLineNum = 101;BA.debugLine="productoToCreate.precioUnitario = txtPrecioUnita";
Debug.ShouldStop(16);
_productotocreate.setField ("_preciounitario" /*RemoteObject*/ ,BA.numberCast(int.class, __ref.getField(false,"_txtpreciounitario" /*RemoteObject*/ ).runMethod(true,"getText")));
 BA.debugLineNum = 102;BA.debugLine="productoToCreate.iva = txtIva.Text";
Debug.ShouldStop(32);
_productotocreate.setField ("_iva" /*RemoteObject*/ ,BA.numberCast(int.class, __ref.getField(false,"_txtiva" /*RemoteObject*/ ).runMethod(true,"getText")));
 BA.debugLineNum = 103;BA.debugLine="productoToCreate.clasificacionId = txtClasificac";
Debug.ShouldStop(64);
_productotocreate.setField ("_clasificacionid" /*RemoteObject*/ ,BA.numberCast(int.class, __ref.getField(false,"_txtclasificacionid" /*RemoteObject*/ ).runMethod(true,"getText")));
 BA.debugLineNum = 105;BA.debugLine="Wait For (productosService.Create(productoToCrea";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "productopage", "btnsave_click"), __ref.getField(false,"_productosservice" /*RemoteObject*/ ).runClassMethod (b4a.example.productosservice.class, "_create" /*RemoteObject*/ ,(Object)(_productotocreate)));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_productoresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("productoResult", _productoresult);
;
 BA.debugLineNum = 106;BA.debugLine="If productoResult <> Null Then";
Debug.ShouldStop(512);
if (true) break;

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean("N",_productoresult)) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 107;BA.debugLine="txtId.Text = productoResult.id";
Debug.ShouldStop(1024);
__ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_productoresult.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 108;BA.debugLine="Msgbox(\"Creación Exitosa\",\"Éxito\")";
Debug.ShouldStop(2048);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Creación Exitosa")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Éxito"))),__ref.getField(false, "ba"));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 110;BA.debugLine="Msgbox(\"No se pudo crear el registro\",\"Error\")";
Debug.ShouldStop(8192);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No se pudo crear el registro")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;

case 9:
//C
this.state = 12;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
 BA.debugLineNum = 114;BA.debugLine="Log(LastException)";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("LogImpl","614221331",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 BA.debugLineNum = 115;BA.debugLine="Msgbox(\"Error\",\"Error\")";
Debug.ShouldStop(262144);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Error")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 118;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e0.toString());}
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
public static void  _btnupdate_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnUpdate_Click (productopage) ","productopage",8,__ref.getField(false, "ba"),__ref,71);
if (RapidSub.canDelegate("btnupdate_click")) { __ref.runUserSub(false, "productopage","btnupdate_click", __ref); return;}
ResumableSub_btnUpdate_Click rsub = new ResumableSub_btnUpdate_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnUpdate_Click extends BA.ResumableSub {
public ResumableSub_btnUpdate_Click(b4a.example.productopage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.productopage parent;
RemoteObject _productotoupdate = RemoteObject.declareNull("b4a.example.producto");
RemoteObject _success = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnUpdate_Click (productopage) ","productopage",8,__ref.getField(false, "ba"),__ref,71);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 72;BA.debugLine="Try";
Debug.ShouldStop(128);
if (true) break;

case 1:
//try
this.state = 12;
this.catchState = 11;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 11;
 BA.debugLineNum = 73;BA.debugLine="Dim productoToUpdate As Producto";
Debug.ShouldStop(256);
_productotoupdate = RemoteObject.createNew ("b4a.example.producto");Debug.locals.put("productoToUpdate", _productotoupdate);
 BA.debugLineNum = 75;BA.debugLine="productoToUpdate.id = txtId.Text";
Debug.ShouldStop(1024);
_productotoupdate.setField ("_id" /*RemoteObject*/ ,BA.numberCast(int.class, __ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText")));
 BA.debugLineNum = 76;BA.debugLine="productoToUpdate.nombre = txtNombre.Text";
Debug.ShouldStop(2048);
_productotoupdate.setField ("_nombre" /*RemoteObject*/ ,__ref.getField(false,"_txtnombre" /*RemoteObject*/ ).runMethod(true,"getText"));
 BA.debugLineNum = 77;BA.debugLine="productoToUpdate.existencia = txtExistencia.Text";
Debug.ShouldStop(4096);
_productotoupdate.setField ("_existencia" /*RemoteObject*/ ,BA.numberCast(int.class, __ref.getField(false,"_txtexistencia" /*RemoteObject*/ ).runMethod(true,"getText")));
 BA.debugLineNum = 78;BA.debugLine="productoToUpdate.precioUnitario = txtPrecioUnita";
Debug.ShouldStop(8192);
_productotoupdate.setField ("_preciounitario" /*RemoteObject*/ ,BA.numberCast(int.class, __ref.getField(false,"_txtpreciounitario" /*RemoteObject*/ ).runMethod(true,"getText")));
 BA.debugLineNum = 79;BA.debugLine="productoToUpdate.iva = txtIva.Text";
Debug.ShouldStop(16384);
_productotoupdate.setField ("_iva" /*RemoteObject*/ ,BA.numberCast(int.class, __ref.getField(false,"_txtiva" /*RemoteObject*/ ).runMethod(true,"getText")));
 BA.debugLineNum = 80;BA.debugLine="productoToUpdate.clasificacionId = txtClasificac";
Debug.ShouldStop(32768);
_productotoupdate.setField ("_clasificacionid" /*RemoteObject*/ ,BA.numberCast(int.class, __ref.getField(false,"_txtclasificacionid" /*RemoteObject*/ ).runMethod(true,"getText")));
 BA.debugLineNum = 82;BA.debugLine="Wait For (productosService.Update(txtId.Text, pr";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "productopage", "btnupdate_click"), __ref.getField(false,"_productosservice" /*RemoteObject*/ ).runClassMethod (b4a.example.productosservice.class, "_update" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText"))),(Object)(_productotoupdate)));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("success", _success);
;
 BA.debugLineNum = 83;BA.debugLine="If success Then";
Debug.ShouldStop(262144);
if (true) break;

case 4:
//if
this.state = 9;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 84;BA.debugLine="Msgbox(\"Actualización Exitosa\",\"Éxito\")";
Debug.ShouldStop(524288);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Actualización Exitosa")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Éxito"))),__ref.getField(false, "ba"));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 86;BA.debugLine="Msgbox(\"No se encontró el registro\",\"Error\")";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No se encontró el registro")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;

case 9:
//C
this.state = 12;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
 BA.debugLineNum = 90;BA.debugLine="Log(LastException)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("LogImpl","614155795",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 BA.debugLineNum = 91;BA.debugLine="Msgbox(\"Error\",\"Error\")";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Error")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 93;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e0.toString());}
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
productopage._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",productopage._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
productopage._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",productopage._xui);
 //BA.debugLineNum = 4;BA.debugLine="Private productosService As ProductosService";
productopage._productosservice = RemoteObject.createNew ("b4a.example.productosservice");__ref.setField("_productosservice",productopage._productosservice);
 //BA.debugLineNum = 5;BA.debugLine="Private txtId As EditText";
productopage._txtid = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtid",productopage._txtid);
 //BA.debugLineNum = 6;BA.debugLine="Private txtNombre As EditText";
productopage._txtnombre = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtnombre",productopage._txtnombre);
 //BA.debugLineNum = 7;BA.debugLine="Private txtExistencia As EditText";
productopage._txtexistencia = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtexistencia",productopage._txtexistencia);
 //BA.debugLineNum = 8;BA.debugLine="Private txtPrecioUnitario As EditText";
productopage._txtpreciounitario = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtpreciounitario",productopage._txtpreciounitario);
 //BA.debugLineNum = 9;BA.debugLine="Private txtIva As EditText";
productopage._txtiva = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtiva",productopage._txtiva);
 //BA.debugLineNum = 10;BA.debugLine="Private txtClasificacionId As EditText";
productopage._txtclasificacionid = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtclasificacionid",productopage._txtclasificacionid);
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (productopage) ","productopage",8,__ref.getField(false, "ba"),__ref,13);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "productopage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(4096);
 BA.debugLineNum = 14;BA.debugLine="productosService.Initialize";
Debug.ShouldStop(8192);
__ref.getField(false,"_productosservice" /*RemoteObject*/ ).runClassMethod (b4a.example.productosservice.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 15;BA.debugLine="Return Me";
Debug.ShouldStop(16384);
Debug.CheckDeviceExceptions();if (true) return __ref;
 BA.debugLineNum = 16;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}