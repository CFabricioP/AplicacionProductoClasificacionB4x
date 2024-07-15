B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.85
@EndOfDesignText@
#Region Shared Files
#CustomBuildAction: folders ready, %WINDIR%\System32\Robocopy.exe,"..\..\Shared Files" "..\Files"
'Ctrl + click to sync files: ide://run?file=%WINDIR%\System32\Robocopy.exe&args=..\..\Shared+Files&args=..\Files&FilesSync=True
#End Region

'Ctrl + click to export as zip: ide://run?File=%B4X%\Zipper.jar&Args=Project.zip

Sub Class_Globals
	Private Root As B4XView
	Private xui As XUI
	Private productoPage As ProductoPage
	Private clasificacionPage As ClasificacionPage
	
End Sub

Public Sub Initialize
'	B4XPages.GetManager.LogEvents = True
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

Private Sub Button1_Click
	xui.MsgboxAsync("Hello world!", "B4X")
End Sub
Private Sub btnProductosPage_Click
	If productoPage.IsInitialized = False Then
		productoPage.Initialize
		B4XPages.AddPage("Productos", productoPage)
	End If
    
	B4XPages.ShowPage("Productos")
End Sub

Private Sub btnClasificacionesPage_Click
	If clasificacionPage.IsInitialized = False Then
		clasificacionPage.Initialize
		B4XPages.AddPage("Clasificaciones", clasificacionPage)
	End If
    
	B4XPages.ShowPage("Clasificaciones")
End Sub