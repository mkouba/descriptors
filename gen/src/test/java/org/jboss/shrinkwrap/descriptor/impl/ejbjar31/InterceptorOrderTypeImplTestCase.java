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
package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.InterceptorOrderType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.spi.xml.dom.XmlDomExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;

public class InterceptorOrderTypeImplTestCase
{   
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      InterceptorOrderType<TestDescriptorImpl> type = new InterceptorOrderTypeImpl<TestDescriptorImpl>(provider, "interceptor-orderType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }
   
   @Test
   public void testInterceptorClass() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      InterceptorOrderType<TestDescriptorImpl> type = new InterceptorOrderTypeImpl<TestDescriptorImpl>(provider, "interceptor-orderType", provider.getRootNode());
      type.setInterceptorClass("value1");
      type.setInterceptorClass("value2");
      type.setInterceptorClassList("value3", "value4");
      assertTrue(type.getInterceptorClassList().size() == 4);
      assertEquals(type.getInterceptorClassList().get(0), "value1");
      assertEquals(type.getInterceptorClassList().get(1), "value2");
      assertEquals(type.getInterceptorClassList().get(2), "value3");
      assertEquals(type.getInterceptorClassList().get(3), "value4");
      type.removeAllInterceptorClass();
      assertTrue(type.getInterceptorClassList().size() == 0);
   }
}
