<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>post_payment_Netbank</name>
   <tag></tag>
   <elementGuidId>95dbd914-dc61-4338-abba-2ad43b89d441</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;operationId\&quot;: ${operationId},\n  \&quot;referenceNumber\&quot;: ${referenceNumber},\n  \&quot;channel\&quot;: ${channel},\n  \&quot;externalTransferStatus\&quot;: ${externalTransferStatus},\n  \&quot;amount\&quot;: ${amount},\n  \&quot;registrationTime\&quot;: ${registrationTime},\n  \&quot;productBranchCode\&quot;: ${productBranchCode},\n  \&quot;recipientAccountNumber\&quot;: ${recipientAccountNumber},\n  \&quot;recipientAccountNumberBankFormat\&quot;: ${recipientAccountNumberBankFormat},\n  \&quot;sender\&quot;: {\n    \&quot;accountNumber\&quot;: ${accountNumber},\n    \&quot;name\&quot;: ${name},\n    \&quot;institutionCode\&quot;: ${institutionCode}\n  },\n  \&quot;alias\&quot;: ${alias},\n  \&quot;referenceCode\&quot;: ${referenceCode},\n  \&quot;remarks\&quot;: ${remarks}\n}&quot;,
  &quot;contentType&quot;: &quot;text/plain&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>text/plain</value>
   </httpHeaderProperties>
   <katalonVersion>7.8.2</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://payments-uat.kayamo.com.ph/api/v1/transactions/callback/netbank/collections</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>'5000090'</defaultValue>
      <description></description>
      <id>cf432c95-e9c9-4f2f-bb75-eb64d6a88b5f</id>
      <masked>false</masked>
      <name>operationId</name>
   </variables>
   <variables>
      <defaultValue>'20220927GXCHPHM2XXXG000000000196876'</defaultValue>
      <description></description>
      <id>aa8919ba-ff67-4cda-9b7b-de81ddaea2dd</id>
      <masked>false</masked>
      <name>referenceNumber</name>
   </variables>
   <variables>
      <defaultValue>'INSTAPAY'</defaultValue>
      <description></description>
      <id>748b360c-bd78-47fe-ac96-63b19bb3280a</id>
      <masked>false</masked>
      <name>channel</name>
   </variables>
   <variables>
      <defaultValue>'SETTLED'</defaultValue>
      <description></description>
      <id>9f3da946-b77e-4efb-a19b-800673e0dd84</id>
      <masked>false</masked>
      <name>externalTransferStatus</name>
   </variables>
   <variables>
      <defaultValue>'9324.25'</defaultValue>
      <description></description>
      <id>6d44ee66-ef07-4137-94d8-40b905c8e72e</id>
      <masked>false</masked>
      <name>amount</name>
   </variables>
   <variables>
      <defaultValue>'2022-10-20T10:45:15.512'</defaultValue>
      <description></description>
      <id>6b87fc51-11b0-40a0-b447-c24d45254bef</id>
      <masked>false</masked>
      <name>registrationTime</name>
   </variables>
   <variables>
      <defaultValue>'14'</defaultValue>
      <description></description>
      <id>b042c2e9-06e8-4581-a8b5-3103115b85b1</id>
      <masked>false</masked>
      <name>productBranchCode</name>
   </variables>
   <variables>
      <defaultValue>'900021000024'</defaultValue>
      <description></description>
      <id>435d92f5-bb78-44e5-b37f-c7fe2c317a3a</id>
      <masked>false</masked>
      <name>recipientAccountNumber</name>
   </variables>
   <variables>
      <defaultValue>'014-001-00001-7'</defaultValue>
      <description></description>
      <id>1b75b5fb-24c8-410b-9de4-b2bcc8aa1536</id>
      <masked>false</masked>
      <name>recipientAccountNumberBankFormat</name>
   </variables>
   <variables>
      <defaultValue>'7010000060140905234'</defaultValue>
      <description></description>
      <id>4429d420-a3a2-433b-9f9f-dc028bdf1978</id>
      <masked>false</masked>
      <name>accountNumber</name>
   </variables>
   <variables>
      <defaultValue>'Ricson Merced Bracamonte'</defaultValue>
      <description></description>
      <id>3bc418ff-e72c-416c-9437-bbda4c4df70b</id>
      <masked>false</masked>
      <name>name</name>
   </variables>
   <variables>
      <defaultValue>'GXCHPHM2XXX'</defaultValue>
      <description></description>
      <id>968067b9-ce09-43a8-89f2-90a89a94cd57</id>
      <masked>false</masked>
      <name>institutionCode</name>
   </variables>
   <variables>
      <defaultValue>'90002'</defaultValue>
      <description></description>
      <id>81e3c208-30ef-4dbf-96cf-a77b56cd4f7d</id>
      <masked>false</masked>
      <name>alias</name>
   </variables>
   <variables>
      <defaultValue>'1000024'</defaultValue>
      <description></description>
      <id>d6a73592-ff00-4959-a4de-8482bef2b848</id>
      <masked>false</masked>
      <name>referenceCode</name>
   </variables>
   <variables>
      <defaultValue>'InstaPay transfer #20220927GXCHPHM2XXXG000000000196444'</defaultValue>
      <description></description>
      <id>d3277cdc-caaf-45ca-a806-136877c01d3c</id>
      <masked>false</masked>
      <name>remarks</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
