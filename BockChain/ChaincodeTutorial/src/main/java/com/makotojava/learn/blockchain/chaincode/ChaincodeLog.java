/*
 * Copyright 2017 Makoto Consulting Group, Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.makotojava.learn.blockchain.chaincode;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hyperledger.java.shim.ChaincodeStub;

/**
 * 
 * @author jstevenperry
 *
 */
public class ChaincodeLog extends AbstractChaincode {

  private static final Log log = LogFactory.getLog(ChaincodeLog.class);

  public static final String CONTRACT_ID = "ChaincodeLogSmartContract";

  public static final String FUNCTION_LOG = "log";

  public static final String KEY_PREFIX = CONTRACT_ID + "-CLSC-";

  /**
   * The driver method. Every chaincode program must have one.
   * This is invoked to start the chaincode running, and register
   * it with the Fabric.
   * 
   * @param args
   */
  public static void main(String[] args) {
    new ChaincodeLog().start(args);
  }

  /**
   * Returns the unique chaincode ID for this chaincode program.
   */
  @Override
  public String getChaincodeID() {
    return null;
  }

  /**
   * Handles initializing this chaincode program.
   * <br/>
   * Caller expects this method to:
   * <ol>
   * <li>Use args[0] as the key for logging.</li>
   * <li>Use args[1] as the log message.</li>
   * <li>Return the logged message.</li>
   * </ol>
   */
  @Override
  protected String handleInit(ChaincodeStub stub, String[] args) {
    return null;
  }

  /**
   * Handles querying the ledger.
   * <br/>
   * Caller expects this method to:
   * <ol>
   * <li>Use args[0] as the key for ledger query.</li>
   * <li>Return the ledger value matching the specified key
   * (which should be the message that was logged using that key).</li>
   * </ol>
   */
  @Override
  protected String handleQuery(ChaincodeStub stub, String[] args) {
    return null;
  }

  /**
   * Handles other methods applied to the ledger.
   * Currently, that functionality is limited to these functions:
   * <ul>
   * <li>log</li>
   * </ul>
   * <br/>
   * Caller expects this method to:
   * <ol>
   * <li>Use args[0] as the key for logging.</li>
   * <li>Use args[1] as the log message.</li>
   * <li>Return the logged message.</li>
   * </ol>
   */
  @Override
  protected String handleOther(ChaincodeStub stub, String function, String[] args) {
    // TODO Auto-generated method stub
    return null;
  }

}
