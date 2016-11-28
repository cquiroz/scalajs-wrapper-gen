package com.olvind.semanticui

import ammonite.ops._
import com.olvind.{ComponentDef, Library, VarName}

import scala.language.implicitConversions

object SemanticUILibrary extends Library[ComponentDef] {

  override val importName   = VarName("semantic-ui")
  override val location     = home / "Projects" / "semantic-react" / "lib"
  override val prefixOpt    = Some("SemanticUI")
  override val name         = "semanticui"
  override val typeMapper   = SemanticUITypeMapper
  override val memberMapper = SemanticUITypeMemberMethodMapper
  override val outputPath   = home / 'Projects / "scalajs-react-components" / 'core / 'src / 'main / 'scala / 'chandu0101 / 'scalajs / 'react / 'components / name

  //todo: make requiresjs figure this stuff out!
  case object Internal {
    /*val AppCanvas          = ComponentDef(CompName("AppCanvas"))
    val BeforeAfterWrapper = ComponentDef(CompName("BeforeAfterWrapper"))
    val EnhancedButton     = ComponentDef(CompName("EnhancedButton"))
    val EnhancedSwitch     = ComponentDef(CompName("EnhancedSwitch"))
    val Overlay            = ComponentDef(CompName("Overlay"))
    val CircleRipple       = ComponentDef(CompName("CircleRipple"))
    val FocusRipple        = ComponentDef(CompName("FocusRipple"))
    val TouchRipple        = ComponentDef(CompName("TouchRipple"))
    val RenderToLayer      = ComponentDef(CompName("RenderToLayer"))
    //val EnhancedTextarea   = ComponentDef(CompName("EnhancedTextarea"))
    val Tooltip            = ComponentDef(CompName("Tooltip"))*/
  }

  /*def DropDownMenu = ComponentDef(CompName("DropDownMenu"))
  def List_        = ComponentDef(CompName("List"))
  def ListItem     = ComponentDef(CompName("ListItem"), Some(Internal.EnhancedButton))
  def Menu         = ComponentDef(CompName("Menu"), Some(List_))
  def Paper        = ComponentDef(CompName("Paper"))
  def RadioButton  = ComponentDef(CompName("RadioButton"), Some(Internal.EnhancedSwitch))
  //def TextField    = ComponentDef(CompName("TextField"), Some(Internal.EnhancedTextarea), domeTypeOpt = Some(DomInput)) */

  val components: Seq[ComponentDef] = Seq.empty
    /*Seq(
      ComponentDef(CompName("AppBar"), Option(Paper)),
      //ComponentDef(CompName("AutoComplete"), Some(TextField)),
      ComponentDef(CompName("Avatar"), multipleChildren = false),
      ComponentDef(CompName("Badge")),
      ComponentDef(CompName("Card"), Some(Paper)),
      ComponentDef(CompName("CardActions")),
      ComponentDef(CompName("CardExpandable"), None),
      ComponentDef(CompName("CardHeader")),
      ComponentDef(CompName("CardMedia")),
      ComponentDef(CompName("CardText")),
      ComponentDef(CompName("CardTitle")),
      //ComponentDef(CompName("Checkbox"), Some(Internal.EnhancedSwitch)),
      //ComponentDef(CompName("Chip"), Some(Internal.EnhancedButton)),
      ComponentDef(CompName("CircularProgress")),
      //ComponentDef(CompName("DatePicker"), Option(TextField), domeTypeOpt = Some(DomInput)),
      ComponentDef(CompName("Dialog"), None),
      ComponentDef(CompName("Divider")),
      //ComponentDef(CompName("Drawer"), None),
      DropDownMenu,
      ComponentDef(CompName("FlatButton"), Some(Internal.EnhancedButton)),
      ComponentDef(CompName("FloatingActionButton"), Some(Internal.EnhancedButton)),
      ComponentDef(CompName("FontIcon")),
      ComponentDef(CompName("GridList")),
      ComponentDef(CompName("GridTile")),
      ComponentDef(CompName("IconButton"), Some(Internal.EnhancedButton)),
      ComponentDef(CompName("IconMenu"), Option(Menu)),
      ComponentDef(CompName("LinearProgress")),
      List_,
      ListItem,
      Menu,
      ComponentDef(CompName("MenuItem"), Option(ListItem)),
      //ComponentDef(CompName("MuiThemeProvider")),
      Paper,
      ComponentDef(CompName("Popover")),
      //ComponentDef(CompName("PopoverAnimationVertical")),
      //RadioButton,
      //ComponentDef(CompName("RadioButtonGroup"), Some(RadioButton)),
      //ComponentDef(CompName("RaisedButton"), Some(Internal.EnhancedButton)),
      ComponentDef(CompName("RefreshIndicator")),
      ComponentDef(CompName("SelectField"), Option(DropDownMenu)),
      ComponentDef(CompName("Slider")),
      ComponentDef(CompName("Snackbar")),
      //ComponentDef(CompName("Step")),
      //ComponentDef(CompName("StepContent")),
      //ComponentDef(CompName("StepLabel")),
      //ComponentDef(CompName("Stepper")),
      //ComponentDef(CompName("Subheader")),
      //ComponentDef(CompName("Tab"), Some(Internal.EnhancedButton)),
      ComponentDef(CompName("Table")),
      ComponentDef(CompName("TableBody")),
      ComponentDef(CompName("TableFooter")),
      ComponentDef(CompName("TableHeader")),
      ComponentDef(CompName("TableHeaderColumn")),
      ComponentDef(CompName("TableRow")),
      ComponentDef(CompName("TableRowColumn")),
      ComponentDef(CompName("Tabs")),
      //TextField,
      //ComponentDef(CompName("TimePicker"), Option(TextField), domeTypeOpt = Some(DomInput)),
      //ComponentDef(CompName("Toggle"), Some(Internal.EnhancedSwitch)),
      ComponentDef(CompName("Toolbar")),
      //ComponentDef(CompName("ToolbarGroup")),
      ComponentDef(CompName("ToolbarSeparator")),
      ComponentDef(CompName("ToolbarTitle"))
    )*/
}
