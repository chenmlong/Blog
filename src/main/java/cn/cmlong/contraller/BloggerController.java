package cn.cmlong.contraller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.cmlong.service.BloggerService;

/**
 * ����Controller��
 * @author cml
 *
 */
@Controller
@RequestMapping("/blogger")
public class BloggerController {

	@Resource 
	private BloggerService bloggerService;
}
