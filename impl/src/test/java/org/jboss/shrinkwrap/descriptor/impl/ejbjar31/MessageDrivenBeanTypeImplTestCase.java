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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.jboss.shrinkwrap.descriptor.api.ejbjar31.MessageDrivenBeanType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.TransactionTypeType;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.junit.Test;

public class MessageDrivenBeanTypeImplTestCase
{
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider,
            "message-driven-beanType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }

   @Test
   public void testDescription() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider,
            "message-driven-beanType", provider.getRootNode());
      type.setDescription("value1");
      type.setDescription("value2");
      type.setDescriptionList("value3", "value4");
      assertTrue(type.getDescriptionList().size() == 4);
      assertEquals(type.getDescriptionList().get(0), "value1");
      assertEquals(type.getDescriptionList().get(1), "value2");
      assertEquals(type.getDescriptionList().get(2), "value3");
      assertEquals(type.getDescriptionList().get(3), "value4");
      type.removeAllDescription();
      assertTrue(type.getDescriptionList().size() == 0);
   }

   @Test
   public void testDisplayName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider,
            "message-driven-beanType", provider.getRootNode());
      type.setDisplayName("value1");
      type.setDisplayName("value2");
      type.setDisplayNameList("value3", "value4");
      assertTrue(type.getDisplayNameList().size() == 4);
      assertEquals(type.getDisplayNameList().get(0), "value1");
      assertEquals(type.getDisplayNameList().get(1), "value2");
      assertEquals(type.getDisplayNameList().get(2), "value3");
      assertEquals(type.getDisplayNameList().get(3), "value4");
      type.removeAllDisplayName();
      assertTrue(type.getDisplayNameList().size() == 0);
   }

   @Test
   public void testIcon() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider,
            "message-driven-beanType", provider.getRootNode());
      type.icon().up();
      type.icon().up();
      assertTrue(type.getIconList().size() == 2);
      type.removeAllIcon();
      assertTrue(type.getIconList().size() == 0);
   }

   @Test
   public void testEnvEntry() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider,
            "message-driven-beanType", provider.getRootNode());
      type.envEntry().up();
      type.envEntry().up();
      assertTrue(type.getEnvEntryList().size() == 2);
      type.removeAllEnvEntry();
      assertTrue(type.getEnvEntryList().size() == 0);
   }

   @Test
   public void testEjbRef() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider,
            "message-driven-beanType", provider.getRootNode());
      type.ejbRef().up();
      type.ejbRef().up();
      assertTrue(type.getEjbRefList().size() == 2);
      type.removeAllEjbRef();
      assertTrue(type.getEjbRefList().size() == 0);
   }

   @Test
   public void testEjbLocalRef() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider,
            "message-driven-beanType", provider.getRootNode());
      type.ejbLocalRef().up();
      type.ejbLocalRef().up();
      assertTrue(type.getEjbLocalRefList().size() == 2);
      type.removeAllEjbLocalRef();
      assertTrue(type.getEjbLocalRefList().size() == 0);
   }

   @Test
   public void testResourceRef() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider,
            "message-driven-beanType", provider.getRootNode());
      type.resourceRef().up();
      type.resourceRef().up();
      assertTrue(type.getResourceRefList().size() == 2);
      type.removeAllResourceRef();
      assertTrue(type.getResourceRefList().size() == 0);
   }

   @Test
   public void testResourceEnvRef() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider,
            "message-driven-beanType", provider.getRootNode());
      type.resourceEnvRef().up();
      type.resourceEnvRef().up();
      assertTrue(type.getResourceEnvRefList().size() == 2);
      type.removeAllResourceEnvRef();
      assertTrue(type.getResourceEnvRefList().size() == 0);
   }

   @Test
   public void testMessageDestinationRef() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider,
            "message-driven-beanType", provider.getRootNode());
      type.messageDestinationRef().up();
      type.messageDestinationRef().up();
      assertTrue(type.getMessageDestinationRefList().size() == 2);
      type.removeAllMessageDestinationRef();
      assertTrue(type.getMessageDestinationRefList().size() == 0);
   }

   @Test
   public void testPersistenceContextRef() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider,
            "message-driven-beanType", provider.getRootNode());
      type.persistenceContextRef().up();
      type.persistenceContextRef().up();
      assertTrue(type.getPersistenceContextRefList().size() == 2);
      type.removeAllPersistenceContextRef();
      assertTrue(type.getPersistenceContextRefList().size() == 0);
   }

   @Test
   public void testPersistenceUnitRef() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider,
            "message-driven-beanType", provider.getRootNode());
      type.persistenceUnitRef().up();
      type.persistenceUnitRef().up();
      assertTrue(type.getPersistenceUnitRefList().size() == 2);
      type.removeAllPersistenceUnitRef();
      assertTrue(type.getPersistenceUnitRefList().size() == 0);
   }

   @Test
   public void testPostConstruct() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider,
            "message-driven-beanType", provider.getRootNode());
      type.postConstruct().up();
      type.postConstruct().up();
      assertTrue(type.getPostConstructList().size() == 2);
      type.removeAllPostConstruct();
      assertTrue(type.getPostConstructList().size() == 0);
   }

   @Test
   public void testPreDestroy() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider,
            "message-driven-beanType", provider.getRootNode());
      type.preDestroy().up();
      type.preDestroy().up();
      assertTrue(type.getPreDestroyList().size() == 2);
      type.removeAllPreDestroy();
      assertTrue(type.getPreDestroyList().size() == 0);
   }

   @Test
   public void testDataSource() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider,
            "message-driven-beanType", provider.getRootNode());
      type.dataSource().up();
      type.dataSource().up();
      assertTrue(type.getDataSourceList().size() == 2);
      type.removeAllDataSource();
      assertTrue(type.getDataSourceList().size() == 0);
   }

   @Test
   public void testEjbName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider,
            "message-driven-beanType", provider.getRootNode());
      type.setEjbName("test");
      assertEquals(type.getEjbName(), "test");
      type.removeEjbName();
      assertNull(type.getEjbName());
   }

   @Test
   public void testMappedName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider,
            "message-driven-beanType", provider.getRootNode());
      type.setMappedName("test");
      assertEquals(type.getMappedName(), "test");
      type.removeMappedName();
      assertNull(type.getMappedName());
   }

   @Test
   public void testEjbClass() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider,
            "message-driven-beanType", provider.getRootNode());
      type.setEjbClass("test");
      assertEquals(type.getEjbClass(), "test");
      type.removeEjbClass();
      assertNull(type.getEjbClass());
   }

   @Test
   public void testMessagingType() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider,
            "message-driven-beanType", provider.getRootNode());
      type.setMessagingType("test");
      assertEquals(type.getMessagingType(), "test");
      type.removeMessagingType();
      assertNull(type.getMessagingType());
   }

   @Test
   public void testTimeoutMethod() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider,
            "message-driven-beanType", provider.getRootNode());
      type.timeoutMethod().up();
      type.removeTimeoutMethod();
      assertNull(provider.getRootNode().getSingle("timeout-method"));
   }

   @Test
   public void testTimer() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider,
            "message-driven-beanType", provider.getRootNode());
      type.timer().up();
      type.timer().up();
      assertTrue(type.getTimerList().size() == 2);
      type.removeAllTimer();
      assertTrue(type.getTimerList().size() == 0);
   }

   @Test
   public void testTransactionType() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider,
            "message-driven-beanType", provider.getRootNode());
      for (TransactionTypeType e : TransactionTypeType.values())
      {
         type.setTransactionType(e);
         assertEquals(type.getTransactionType(), e);
         type.setTransactionType(e.toString());
         assertEquals(type.getTransactionTypeAsString(), e.toString());
      }
   }

   @Test
   public void testMessageDestinationType() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider,
            "message-driven-beanType", provider.getRootNode());
      type.setMessageDestinationType("test");
      assertEquals(type.getMessageDestinationType(), "test");
      type.removeMessageDestinationType();
      assertNull(type.getMessageDestinationType());
   }

   @Test
   public void testMessageDestinationLink() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider,
            "message-driven-beanType", provider.getRootNode());
      type.setMessageDestinationLink("test");
      assertEquals(type.getMessageDestinationLink(), "test");
      type.removeMessageDestinationLink();
      assertNull(type.getMessageDestinationLink());
   }

   @Test
   public void testActivationConfig() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider,
            "message-driven-beanType", provider.getRootNode());
      type.activationConfig().up();
      type.removeActivationConfig();
      assertNull(provider.getRootNode().getSingle("activation-config"));
   }

   @Test
   public void testAroundInvoke() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider,
            "message-driven-beanType", provider.getRootNode());
      type.aroundInvoke().up();
      type.aroundInvoke().up();
      assertTrue(type.getAroundInvokeList().size() == 2);
      type.removeAllAroundInvoke();
      assertTrue(type.getAroundInvokeList().size() == 0);
   }

   @Test
   public void testAroundTimeout() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider,
            "message-driven-beanType", provider.getRootNode());
      type.aroundTimeout().up();
      type.aroundTimeout().up();
      assertTrue(type.getAroundTimeoutList().size() == 2);
      type.removeAllAroundTimeout();
      assertTrue(type.getAroundTimeoutList().size() == 0);
   }

   @Test
   public void testSecurityRoleRef() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider,
            "message-driven-beanType", provider.getRootNode());
      type.securityRoleRef().up();
      type.securityRoleRef().up();
      assertTrue(type.getSecurityRoleRefList().size() == 2);
      type.removeAllSecurityRoleRef();
      assertTrue(type.getSecurityRoleRefList().size() == 0);
   }

   @Test
   public void testSecurityIdentity() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider,
            "message-driven-beanType", provider.getRootNode());
      type.securityIdentity().up();
      type.removeSecurityIdentity();
      assertNull(provider.getRootNode().getSingle("security-identity"));
   }
}
