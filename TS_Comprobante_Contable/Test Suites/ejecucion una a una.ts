<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>ejecucion una a una</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <testSuiteGuid>8421f17b-99e5-4704-91e6-dd87e78b5b55</testSuiteGuid>
   <testCaseLink>
      <guid>95b0cecd-c6cf-4db8-885c-ab216c44b828</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/TS_Login/TC_Login</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>e23c779d-6bf0-438b-8de5-f8011df76f5d</id>
         <iterationEntity>
            <iterationType>RANGE</iterationType>
            <value>1-1</value>
         </iterationEntity>
         <testDataId>Data Files/DD_Login</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>e23c779d-6bf0-438b-8de5-f8011df76f5d</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Direccion</value>
         <variableId>e15c09cb-a9bd-4b7b-8fc3-6505b2df9ed0</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>e23c779d-6bf0-438b-8de5-f8011df76f5d</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Usuario</value>
         <variableId>ddb59264-7514-4b51-90f5-8d537a37eb44</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>e23c779d-6bf0-438b-8de5-f8011df76f5d</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Contrasena</value>
         <variableId>516b68a8-369c-4e39-a736-742c65ea3698</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>f70fea20-8e49-4388-b890-fd62af39413b</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/TS_Menu/TC_Menu_CC</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>c4a503ac-91e8-49ad-9d17-eb0b3102421c</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/CC/CC_Crea_Enca/TC_CC_Crea_Enca</testCaseId>
      <testDataLink>
         <combinationType>MANY</combinationType>
         <id>fe8c061b-74d7-488f-9ee7-1ac08f175bf5</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value>1-1</value>
         </iterationEntity>
         <testDataId>Data Files/DD_CC_Crea_Enca</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>fe8c061b-74d7-488f-9ee7-1ac08f175bf5</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>XLS_No_Comprobante_Enca</value>
         <variableId>2f0a7b56-77bd-4ae9-abb7-0b733970eed9</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>fe8c061b-74d7-488f-9ee7-1ac08f175bf5</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>XLS_Tipo_Comprobante</value>
         <variableId>a18ed672-b757-442c-9679-30618af5f3f2</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>fe8c061b-74d7-488f-9ee7-1ac08f175bf5</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>XLS_Maneja_Numeracion_Automatica</value>
         <variableId>75a3f090-9023-47e4-aefc-4937fb42a249</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>fe8c061b-74d7-488f-9ee7-1ac08f175bf5</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>XLS_Numero_Documento</value>
         <variableId>5ff9e4fd-caac-4905-8fb4-1b9899296e75</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>fe8c061b-74d7-488f-9ee7-1ac08f175bf5</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>XLS_Digita_Valida</value>
         <variableId>31def9e1-e91e-44fa-ae96-0456212f428b</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>fe8c061b-74d7-488f-9ee7-1ac08f175bf5</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>XLS_Fecha_Ano</value>
         <variableId>5650837f-90d4-4ac3-bc86-5847efb2fd0f</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>fe8c061b-74d7-488f-9ee7-1ac08f175bf5</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>XLS_Fecha_Mes</value>
         <variableId>267c72b6-a197-4c38-927c-54db5c224bad</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>fe8c061b-74d7-488f-9ee7-1ac08f175bf5</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>XLS_Fecha_Dia</value>
         <variableId>795d3287-0169-4a60-a645-c87e7e2bff61</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>fe8c061b-74d7-488f-9ee7-1ac08f175bf5</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>XLS_Maneja_Moneda_Extranjera</value>
         <variableId>418b4f6f-e703-4ea9-8b10-9898a51c546b</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>fe8c061b-74d7-488f-9ee7-1ac08f175bf5</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>XLS_Moneda_Extranjera</value>
         <variableId>7f2e0ab4-7009-4436-bda2-07bdf1eaadc7</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>fe8c061b-74d7-488f-9ee7-1ac08f175bf5</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>XLS_Valor_Tasa_Extranjera</value>
         <variableId>1263d1c5-295e-482b-ad11-3bc1db052ffd</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>92dffabc-17f8-4a8e-8ce1-14eee54bcd5d</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/CC/CC_Crea_Secu/TC_CC_Crea_Secu Con IF</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>c14ee339-8215-42de-8f62-4527c6c7070a</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value>1-4</value>
         </iterationEntity>
         <testDataId>Data Files/DD_CC_Crea_Secu_Calc</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>c14ee339-8215-42de-8f62-4527c6c7070a</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>XLS_No_Comprobante_Secu</value>
         <variableId>29d95b74-33a1-4c63-859d-66846e517964</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>c14ee339-8215-42de-8f62-4527c6c7070a</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>XLS_Tipo_Cuenta</value>
         <variableId>978bb50e-1c1a-4095-a67b-c175cb37baa4</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>c14ee339-8215-42de-8f62-4527c6c7070a</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>XLS_Cuenta</value>
         <variableId>431a9854-b5e1-43db-88e4-9f7b4e739f98</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>c14ee339-8215-42de-8f62-4527c6c7070a</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>XLS_Descripcion</value>
         <variableId>b9bbce7d-a5a8-4023-8265-bd0f76d12ff0</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>c14ee339-8215-42de-8f62-4527c6c7070a</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>XLS_NitTercero</value>
         <variableId>1190725f-088f-468b-9a6e-015844ce3f26</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>c14ee339-8215-42de-8f62-4527c6c7070a</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>XLS_Debito_o_Credito</value>
         <variableId>7614ab6b-240a-414b-bdbf-fcd99a54848a</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>c14ee339-8215-42de-8f62-4527c6c7070a</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>XLS_Valor</value>
         <variableId>c95e6ecc-9e8b-484e-9a87-31185c83f7ca</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>25c63795-5cc2-42e1-a6f2-aae0f24a6c0d</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>fb864b4e-47ad-448b-91f0-c5e219c9c8d3</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/CC/Crea_Pie/TC_Crea_Pie</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>2ced970f-c5d6-41e6-ad6e-95e728db2bec</id>
         <iterationEntity>
            <iterationType>RANGE</iterationType>
            <value>1-1</value>
         </iterationEntity>
         <testDataId>Data Files/DD_CC_Crea_Enca</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>96f9c407-8d26-4453-8d9b-a269b980dc44</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>caf3ff0c-7545-434b-8a78-245e60632340</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>