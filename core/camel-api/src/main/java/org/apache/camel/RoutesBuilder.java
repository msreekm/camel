/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel;

/**
 * A routes builder is capable of building routes using the builder and model classes.
 * <p/>
 * Eventually the routes are added to a {@link org.apache.camel.CamelContext} where they run inside.
 *
 * This interface is not intended to be used by Camel end users. Instead, Camel users will use
 * <tt>org.apache.camel.builder.RouteBuilder</tt> to build routes in Java DSL.
 */
public interface RoutesBuilder {

    /**
     * Adds the routes from this Route Builder to the CamelContext.
     *
     * @param  context   the Camel context
     * @throws Exception is thrown if initialization of routes failed
     */
    void addRoutesToCamelContext(CamelContext context) throws Exception;

    /**
     * Adds or updates the routes from this Route Builder to the CamelContext.
     *
     * @param  context   the Camel context
     * @throws Exception is thrown if initialization of routes failed
     */
    void updateRoutesToCamelContext(CamelContext context) throws Exception;

}
