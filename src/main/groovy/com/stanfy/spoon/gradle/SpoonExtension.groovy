package com.stanfy.spoon.gradle

/**
 * Spoon extension.
 */
class SpoonExtension {

  /** Debug logging flag. */
  boolean debug

  /** Fail if no device is connected flag. */
  boolean failIfNoDeviceConnected

  /** Ignore test failures flag. */
  boolean ignoreFailures

  /** Fully qualified name of the test class to be run (e.g. com.example.foo.test.MyTestCase). */
  String className

  /** Test method to be run. Used when `className` is provided. */
  String methodName

  /** Devices to run the tests on (specified with serial numbers). */
  Set<String> devices
  
  /** Whether or not animations are enabled, useful for slow machines or projects with many screenshots. */
  boolean noAnimations

  /** Output directory for the spoon report files. If empty, the default dir will be used. */
  File baseOutputDir
  
  /** ADB timeout (in seconds). */
  // Since negative timeouts do not make sense, -1 seems to be a good value to indicate timeout is not set.
  int adbTimeout = -1

}
