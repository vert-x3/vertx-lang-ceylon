/*
 * Copyright 2014 Red Hat, Inc.
 *
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  and Apache License v2.0 which accompanies this distribution.
 *
 *  The Eclipse Public License is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  The Apache License v2.0 is available at
 *  http://www.opensource.org/licenses/apache2.0.php
 *
 *  You may elect to redistribute this code under either of these licenses.
 */

/**
 * If you are embedding Vert.x in Ceylon you should import Vert.x modules of your Ceylon module:
 *
 * [source,xml,subs="+attributes"]
 * ----
 * native("jvm")
 * module my.module "1.0.0" {
 *   shared import io.vertx.ceylon.core "${maven.version}";
 * }
 * ----
 *
 * The following stack of modules is supported in ${maven.version}:
 *
 * - `io.vertx.ceylon.core`
 * - `io.vertx.ceylon.jdbc`
 * - `io.vertx.ceylon.sql`
 * - `io.vertx.ceylon.web`
 * - `io.vertx.ceylon.auth.common`
 * - `io.vertx.ceylon.auth.jdbc`
 * - `io.vertx.ceylon.auth.jwt`
 * - `io.vertx.ceylon.auth.oauth2`
 * - `io.vertx.ceylon.auth.shiro`
 */
@Document(fileName = "override/dependencies.adoc")
package docoverride.dependencies;

import io.vertx.docgen.Document;