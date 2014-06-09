/*
 * Copyright (c) 2014 Spotify AB.
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.spotify.docker.client.messages;

import com.google.common.base.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Version {

  @JsonProperty("Version") private String version;
  @JsonProperty("GitCommit") private String gitCommit;
  @JsonProperty("GoVersion") private String goVersion;

  public String version() {
    return version;
  }

  public String gitCommit() {
    return gitCommit;
  }

  public String goVersion() {
    return goVersion;
  }

  @Override
  public boolean equals(final Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    final Version version1 = (Version) o;

    if (gitCommit != null ? !gitCommit.equals(version1.gitCommit) : version1.gitCommit != null) {
      return false;
    }
    if (goVersion != null ? !goVersion.equals(version1.goVersion) : version1.goVersion != null) {
      return false;
    }
    if (version != null ? !version.equals(version1.version) : version1.version != null) {
      return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int result = version != null ? version.hashCode() : 0;
    result = 31 * result + (gitCommit != null ? gitCommit.hashCode() : 0);
    result = 31 * result + (goVersion != null ? goVersion.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return Objects.toStringHelper(this)
        .add("version", version)
        .add("gitCommit", gitCommit)
        .add("goVersion", goVersion)
        .toString();
  }
}
