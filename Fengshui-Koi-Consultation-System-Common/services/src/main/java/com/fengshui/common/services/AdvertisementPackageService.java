package com.fengshui.common.services;

import com.fengshui.common.shared.Request.Advertisement.GetAdvertisementByIdRequestModel;
import com.fengshui.common.shared.Request.Advertisement.GetListAdvertisementRequestModel;
import com.fengshui.common.shared.Request.AdvertisementPackage.CreateAdvertisementPackageRequestModel;
import com.fengshui.common.shared.Request.AdvertisementPackage.GetAdvertisementPackageByIdRequestModel;
import com.fengshui.common.shared.Request.AdvertisementPackage.GetListAdvertisementPackageRequestModel;
import com.fengshui.common.shared.Response.Advertisement.GetAdvertisementByIdResponseModel;
import com.fengshui.common.shared.Response.Advertisement.GetListAdvertisementResponseModel;
import com.fengshui.common.shared.Response.AdvertisementPackage.CreateAdvertisementPackageResponseModel;
import com.fengshui.common.shared.Response.AdvertisementPackage.GetAdvertisementPackageByIdResponseModel;
import com.fengshui.common.shared.Response.AdvertisementPackage.GetListAdvertisementPackageResponseModel;
import org.springframework.http.ResponseEntity;

public interface AdvertisementPackageService {
    public ResponseEntity<CreateAdvertisementPackageResponseModel>createAdvertisementPackage(CreateAdvertisementPackageRequestModel requestModel);
    public ResponseEntity<GetListAdvertisementPackageResponseModel> getListAdvertisementPackage(GetListAdvertisementPackageRequestModel requestModel);
    public ResponseEntity<GetAdvertisementPackageByIdResponseModel> getAdvertisementPackageById(GetAdvertisementPackageByIdRequestModel requestModel);
}