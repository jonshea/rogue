libraryDependencies <++= (scalaVersion) { scalaVersion =>
  val specsVersion = scalaVersion match {
    case "2.11.5" => "2.4.2"
    case "2.10.4" => "1.12.3"
  }
  val liftVersion = scalaVersion match {
    case "2.11.5"          => "2.6-RC1"
    case "2.10.4"          => "2.6-RC1"
  }
  def sv(s: String) = s + "_" + (scalaVersion match {
      case "2.11.5" => "2.11"
      case "2.10.4" => "2.10"
  })
  Seq(
    "net.liftweb"              % sv("lift-mongodb")    % liftVersion  % "compile" intransitive(),
    "net.liftweb"              % sv("lift-common")     % liftVersion  % "compile",
    "net.liftweb"              % sv("lift-json")       % liftVersion  % "compile",
    "net.liftweb"              % sv("lift-util")       % liftVersion  % "compile",
    "joda-time"                % "joda-time"           % "2.1"        % "provided",
    "org.joda"                 % "joda-convert"        % "1.2"        % "provided",
    "org.mongodb"              % "mongo-java-driver"   % "2.12.5"     % "compile",
    "junit"                    % "junit"               % "4.5"        % "test",
    "com.novocode"             % "junit-interface"     % "0.6"        % "test",
    "ch.qos.logback"           % "logback-classic"     % "0.9.26"     % "provided",
    "org.specs2"              %% "specs2"              % specsVersion % "test",
    "org.scala-lang"           % "scala-compiler"      % scalaVersion % "test"
  )
}

Seq(RogueBuild.defaultSettings: _*)
