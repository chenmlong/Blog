package cn.cmlong.contraller.admin;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.cmlong.service.BloggerService;

/**
 * 管理员博主Controller层
 * @author cml
 *
 */
@Controller
@RequestMapping("/admin/blogger")
public class BloggerAdminController {

	@Resource 
	private BloggerService bloggerService;
}
