package com.yan.service;

import com.yan.model.TblAdmin;

import java.util.List;

/**
 * Created by yan on 2017/6/20/0020.
 */
public interface AdminService {

    List<TblAdmin> getAllAdmin();

    List<TblAdmin> findAllUser();
}
