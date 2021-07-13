// Copyright 2021 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.finapp;

import com.google.cloud.ByteArray;
import com.google.cloud.spanner.*;

import java.math.BigDecimal;

public interface SpannerDaoInterface {

  void createCustomer(ByteArray customerId, String name, String address) throws SpannerException;

  void createAccount(
      ByteArray accountId, AccountType accountType, AccountStatus accountStatus, BigDecimal balance)
      throws SpannerException;

  void addAccountForCustomer(
      ByteArray customerId, ByteArray accountId, ByteArray roleId, String roleName)
      throws SpannerException;

  void moveAccountBalance(ByteArray fromAccountId, ByteArray toAccountId,
      BigDecimal amount) throws SpannerException;
}
