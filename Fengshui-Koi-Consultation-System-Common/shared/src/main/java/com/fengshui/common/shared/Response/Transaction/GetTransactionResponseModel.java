package com.fengshui.common.shared.Response.Transaction;

import com.fengshui.common.repository.postgresql.dto.TransactionDTO;
import com.fengshui.common.shared.Response.BaseResponseModel;

import java.util.List;
public class GetTransactionResponseModel extends BaseResponseModel {
    public GetTransactionResponseModel(boolean has_error, List<TransactionDTO> payload, Object error) { super(has_error, payload, error); }
}