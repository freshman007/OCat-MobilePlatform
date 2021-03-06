package com.lhc.ocat.mobileplatform.domain.dos;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;

/**
 * @author lhc
 * @date 2019-11-29 18:28
 */
@TableName(value = "role_permission")
@Data
@Builder
public class RolePermissionDO {
    private Long id;
    private Long roleId;
    private Long permissionId;
}
