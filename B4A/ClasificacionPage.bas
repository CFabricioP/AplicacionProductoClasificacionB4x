B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Private clasificacionesService As ClasificacionesService
	Private txtId As EditText
	Private txtDescripcion As EditText
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	clasificacionesService.Initialize
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	'load the layout to Root
	Root.LoadLayout("ClasificacionPage")
    
End Sub

Private Sub btnRead_Click
	Try
		Wait For (clasificacionesService.ReadById(txtId.Text)) Complete (clasificacion As Clasificacion)
    
		If clasificacion.id <> 0 Then
			txtId.Text = clasificacion.id
			txtDescripcion.Text = clasificacion.descripcion
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
		Wait For (clasificacionesService.Delete(txtId.Text)) Complete (success As Boolean)
		If success Then
			txtId.Text = ""
			txtDescripcion.Text = ""
            
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
		Dim clasificacionToUpdate As Clasificacion
        
		clasificacionToUpdate.id = txtId.Text
		clasificacionToUpdate.descripcion = txtDescripcion.Text
        
		Wait For (clasificacionesService.Update(txtId.Text, clasificacionToUpdate)) Complete (success As Boolean)
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
		Dim clasificacionToCreate As Clasificacion
        
		clasificacionToCreate.descripcion = txtDescripcion.Text
        
		Wait For (clasificacionesService.Create(clasificacionToCreate)) Complete (clasificacionResult As Clasificacion)
		If clasificacionResult <> Null Then
			txtId.Text = clasificacionResult.id
			Msgbox("Creación Exitosa","Éxito")
		Else
			Msgbox("No se pudo crear el registro","Error")
		End If
        
	Catch
		Log(LastException)
		Msgbox("Error","Error")
	End Try
    
End Sub
