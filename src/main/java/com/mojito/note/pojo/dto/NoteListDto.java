package com.mojito.note.pojo.dto;

import com.mojito.note.pojo.constant.PermissionEnum;
import lombok.Getter;
import lombok.Setter;

/**
 * description
 *
 * @author liufengqiang <liufengqiang@touchealth.com>
 * @date 2019-12-22 12:53
 */
@Getter
@Setter
public class NoteListDto {

    private Long id;
    /** 笔记名 */
    private String name;
    /** 是否置顶 */
    private Boolean isSetTop;
    /** 分类id */
    private Long categoryId;
    /** 分类名 */
    private String category;
    /** 权限 0.公开 1.自己可见 2.匿名发表
     * @see PermissionEnum */
    private Integer permission;
    /** 插图 */
    private String picture;
    /** 笔记类型 0.开发 1.生活 2.杂文 */
    private Integer noteType;
}
