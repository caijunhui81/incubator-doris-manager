// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

package org.apache.doris.stack.rest;

public enum RestApiStatusCode {
    OK(0),
    COMMON_ERROR(1),
    HDFS_HOST_ERROR(11),
    HDFS_URL_ERROR(12),
    NOPERMISSION(400),
    UNAUTHORIZED(401),
    BAD_REQUEST(403),
    NOT_FOUND(404),
    INTERNAL_SERVER_ERROR(500);

    public int code;

    RestApiStatusCode(int code) {
        this.code = code;
    }
}
