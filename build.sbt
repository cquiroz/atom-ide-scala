import org.scalajs.core.tools.linker.standard._

name := "atom-ide-scala"
organization := "laughedelic"

scalaVersion := "2.12.4"

scalacOptions ++= Seq(
  "-encoding",
  "utf8",
  "-feature",
  "-language:postfixOps",
  "-language:implicitConversions",
  "-language:higherKinds",
  "-unchecked",
  "-deprecation",
  "-Yrangepos",
  "-P:scalajs:sjsDefinedByDefault"
)

enablePlugins(ScalaJSPlugin)
scalaJSLinkerConfig ~= {
  _.withModuleKind(ModuleKind.CommonJSModule) andThen
  _.withOutputMode(OutputMode.ECMAScript2015)
}
