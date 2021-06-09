#!/bin/bash
scala mandato11.scala "$@" | scala mandato13.scala | scala mandato12.scala
