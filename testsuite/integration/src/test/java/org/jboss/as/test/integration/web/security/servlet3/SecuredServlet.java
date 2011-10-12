/*
 * JBoss, Home of Professional Open Source.
 * Copyright (c) 2011, Red Hat, Inc., and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.jboss.as.test.integration.web.security.servlet3;

import java.io.IOException;
import java.io.Writer;

import javax.annotation.security.DeclareRoles;
import javax.servlet.ServletException;
import javax.servlet.annotation.HttpConstraint;
import javax.servlet.annotation.ServletSecurity;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

<<<<<<< HEAD:testsuite/integration/src/test/java/org/jboss/as/test/integration/web/security/servlet3/SecuredServlet.java
/**
 * A simple servlet that just writes back a string
 *
 * @author Anil Saldhana
 */
@WebServlet(name = "SecuredServlet", urlPatterns = { "/secured/" }, loadOnStartup = 1)
@ServletSecurity(@HttpConstraint(rolesAllowed = { "gooduser" }))
@DeclareRoles("gooduser")
public class SecuredServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Writer writer = resp.getWriter();
        writer.write("GOOD");
=======
@SuppressWarnings("serial")
public class EndpointServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        PrintWriter out = res.getWriter();
        String testParam = req.getParameter("test");
        if ("plain".equals(testParam)) {
            out.println("Hello from Servlet");
        } else if ("initProp".equals(testParam)) {
            String value = getInitParameter(testParam);
            out.println(testParam + "=" + value);
        } else {
            throw new IllegalArgumentException("Invalid 'test' parameter: " + testParam);
        }
        out.close();
>>>>>>> [AS7-1601] Cannot deploy OSGi webap bundle with *.war suffix:testsuite/integration/src/test/java/org/jboss/as/testsuite/integration/osgi/webapp/bundle/EndpointServlet.java
    }
}