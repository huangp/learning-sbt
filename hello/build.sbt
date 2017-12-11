import Dependencies._
//               creator method[return type](description)
lazy val hello = taskKey[Unit]("An example task")

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.3",
      version      := "0.1.0-SNAPSHOT"
    )),
    // key name, operator :=, "Hello" is the setting body
    // key can be SettingKey[T] or TaskKey[T] or InputKey[T]
    name := "Hello",
    // here I defined a custom key called hello and assigned a computation task to it (print hello)
    // task will be re-evalutated each time whereas settings will be ketp around
    hello := { println("hello") },
    libraryDependencies += scalaTest % Test
  )
