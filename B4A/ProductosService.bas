B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
Sub Class_Globals
	Public ApiUrl As String
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	ApiUrl ="https://cloudcomputingapi2.azurewebsites.net/api/Productos"
End Sub

Public Sub Create(producto As Producto) As ResumableSub
	Dim json As JSONGenerator
	json.Initialize(CreateMap("nombre": producto.nombre, "existencia": producto.existencia, "precioUnitario": producto.precioUnitario, "iva": producto.iva, "clasificacionId": producto.clasificacionId))

	Dim apijob As HttpJob
	apijob.Initialize("", Me)
	apijob.PostString(ApiUrl, json.ToString)
	apijob.GetRequest.SetContentType("application/json")

	Wait For (apijob) JobDone(resultado As HttpJob)

	If resultado.Success = False Then
		Log("Error: " & resultado.ErrorMessage)
		Return Null
	End If

	Dim jsonParser As JSONParser
	jsonParser.Initialize(resultado.GetString)
	Dim map As Map = jsonParser.NextObject

	producto.id = map.Get("id")
	producto.nombre = map.Get("nombre")
	producto.existencia = map.Get("existencia")
	producto.precioUnitario = map.Get("precioUnitario")
	producto.iva = map.Get("iva")
	producto.clasificacionId = map.Get("clasificacionId")
	Return producto
End Sub

Public Sub ReadById(id As Int) As ResumableSub
	Dim producto As Producto
	producto.Initialize

	Dim apijob As HttpJob
	apijob.Initialize("", Me)
	apijob.Download(ApiUrl & "/" & id)
	Wait For (apijob) JobDone(resultado As HttpJob)

	If resultado.Success = False Then
		Log("Error: " & resultado.ErrorMessage)
		Return Null
	End If

	Dim jsonParser As JSONParser
	jsonParser.Initialize(resultado.GetString)
	Dim map As Map = jsonParser.NextObject

	producto.id = map.Get("id")
	producto.nombre = map.Get("nombre")
	producto.existencia = map.Get("existencia")
	producto.precioUnitario = map.Get("precioUnitario")
	producto.iva = map.Get("iva")
	producto.clasificacionId = map.Get("clasificacionId")

	Return producto
End Sub

Public Sub Update(id As Int, producto As Producto) As ResumableSub
	Dim json As JSONGenerator
	json.Initialize(CreateMap("id": producto.id, "nombre": producto.nombre, "existencia": producto.existencia, "precioUnitario": producto.precioUnitario, "iva": producto.iva, "clasificacionId": producto.clasificacionId))

	Dim apijob As HttpJob
	apijob.Initialize("", Me)
	apijob.PutString(ApiUrl & "/" & id, json.ToString)
	apijob.GetRequest.SetContentType("application/json")

	Wait For (apijob) JobDone(resultado As HttpJob)

	If resultado.Success = False Then
		Log("Error: " & resultado.ErrorMessage)
	End If

	Return resultado.Success
End Sub

Public Sub Delete(id As Int) As ResumableSub
	Dim apijob As HttpJob
	apijob.Initialize("", Me)
	apijob.Delete(ApiUrl & "/" & id)
	Wait For (apijob) JobDone(resultado As HttpJob)

	If resultado.Success = False Then
		Log("Error: " & resultado.ErrorMessage)
	End If

	Return resultado.Success
End Sub