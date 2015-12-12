/*
   Copyright 2015 Janek Bogucki

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/
package com.scalacraft.examples.collection

import java.{lang => jl, util => ju}, java.util.{concurrent => juc, Properties}
import scala.language.implicitConversions

import scala.collection.mutable

import org.scalatest.PartialFunctionValues._
import org.scalatest.{Matchers, WordSpec}

import scala.collection.JavaConverters._

class JavaConvertersSpec extends WordSpec with Matchers {

  private val A = "A"
  private val B = "B"

  "JavaConverters" when {
    "imported" should {
      "add asScala methods to Java classes" in {

        val javaProperties = new Properties()
        javaProperties.put(A, B)

        val scalaMap: mutable.Map[String, String] = javaProperties.asScala
        scalaMap.valueAt(A) should be(B)
      }

      "add asJava methods to Scala classes" in {
        fail()
      }
    }
  }

}
