
/*
 * Copyright (c) 2021, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.conditional.auth.typingdna.api.impl;

import org.wso2.carbon.identity.conditional.auth.typingdna.api.ServerApiService;
import org.wso2.carbon.identity.conditional.auth.typingdna.api.core.TypingDNAServiceImpl;

import javax.ws.rs.core.Response;

public class ServerApiServiceImpl extends ServerApiService {

    /**
     * Function that is used to retrieve whether typingdna enabled or not in tenant.
     *
     * @return enable true if typingdna enabled in tenant else false.
     */
    @Override
    public Response serverTypingdnaConfigGet() {

        TypingDNAServiceImpl enable = new TypingDNAServiceImpl();
        return Response.ok().entity(enable.getEnabled()).build();
    }
}
