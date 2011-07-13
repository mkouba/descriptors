/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat Middleware LLC, and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.shrinkwrap.descriptor.impl.jboss51;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.jboss.shrinkwrap.descriptor.api.jboss51.WebservicesType;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.junit.Test;

public class WebservicesTypeImplTestCase
{
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      WebservicesType<TestDescriptorImpl> type = new WebservicesTypeImpl<TestDescriptorImpl>(provider,
            "webservicesType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }

   @Test
   public void testContextRoot() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      WebservicesType<TestDescriptorImpl> type = new WebservicesTypeImpl<TestDescriptorImpl>(provider,
            "webservicesType", provider.getRootNode());
      type.setContextRoot("test");
      assertEquals(type.getContextRoot(), "test");
      type.removeContextRoot();
      assertNull(type.getContextRoot());
   }

   @Test
   public void testWebserviceDescription() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      WebservicesType<TestDescriptorImpl> type = new WebservicesTypeImpl<TestDescriptorImpl>(provider,
            "webservicesType", provider.getRootNode());
      type.webserviceDescription().up();
      type.webserviceDescription().up();
      assertTrue(type.getWebserviceDescriptionList().size() == 2);
      type.removeAllWebserviceDescription();
      assertTrue(type.getWebserviceDescriptionList().size() == 0);
   }
}
