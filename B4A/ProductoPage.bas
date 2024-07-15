B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Private productosService As ProductosService
	Private txtId As EditText
	Private txtNombre As EditText
	Private txtExistencia As EditText
	Private txtPrecioUnitario As EditText
	Private txtIva As EditText
	Private txtClasificacionId As EditText
End Sub

Public Sub Initialize As Object
	productosService.Initialize
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	'load the layout to Root
	Root.LoadLayout("ProductoPage")
    
End Sub

Private Sub btnRead_Click
	Try
		Wait For (productosService.ReadById(txtId.Text)) Complete (producto As Producto)
    
		If producto.id <> 0 Then
			txtId.Text = producto.id
			txtNombre.Text = producto.nombre
			txtExistencia.Text = producto.existencia
			txtPrecioUnitario.Text = producto.precioUnitario
			txtIva.Text = producto.iva
			txtClasificacionId.Text = producto.clasificacionId
		Else
			Msgbox("No hay datos","Error")
		End If
        
	Catch
		Log(LastException)
		Msgbox("No hay datos","Error")
	End Try
    
End Sub

Private Sub btnDelete_Click
	Try
		Wait For (productosService.Delete(txtId.Text)) Complete (success As Boolean)
		If success Then
			txtId.Text = ""
			txtNombre.Text = ""
			txtExistencia.Text = ""
			txtPrecioUnitario.Text = ""
			txtIva.Text = ""
			txtClasificacionId.Text = ""
            
			Msgbox("Eliminación Exitosa","Éxito")
		Else
			Msgbox("No se encontró el registro","Error")
		End If
        
	Catch
		Log(LastException)
		Msgbox("Error","Error")
	End Try
    
End Sub

Private Sub btnUpdate_Click
	Try
		Dim productoToUpdate As Producto
        
		productoToUpdate.id = txtId.Text
		productoToUpdate.nombre = txtNombre.Text
		productoToUpdate.existencia = txtExistencia.Text
		productoToUpdate.precioUnitario = txtPrecioUnitario.Text
		productoToUpdate.iva = txtIva.Text
		productoToUpdate.clasificacionId = txtClasificacionId.Text
        
		Wait For (productosService.Update(txtId.Text, productoToUpdate)) Complete (success As Boolean)
		If success Then
			Msgbox("Actualización Exitosa","Éxito")
		Else
			Msgbox("No se encontró el registro","Error")
		End If
        
	Catch
		Log(LastException)
		Msgbox("Error","Error")
	End Try
End Sub

Private Sub btnSave_Click
	Try
		Dim productoToCreate As Producto
        
		productoToCreate.nombre = txtNombre.Text
		productoToCreate.existencia = txtExistencia.Text
		productoToCreate.precioUnitario = txtPrecioUnitario.Text
		productoToCreate.iva = txtIva.Text
		productoToCreate.clasificacionId = txtClasificacionId.Text
        
		Wait For (productosService.Create(productoToCreate)) Complete (productoResult As Producto)
		If productoResult <> Null Then
			txtId.Text = productoResult.id
			Msgbox("Creación Exitosa","Éxito")
		Else
			Msgbox("No se pudo crear el registro","Error")
		End If
        
	Catch
		Log(LastException)
		Msgbox("Error","Error")
	End Try
    
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.