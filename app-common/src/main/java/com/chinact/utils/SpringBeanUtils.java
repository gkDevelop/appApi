package com.chinact.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationContextException;
import org.springframework.stereotype.Component;

import com.baomidou.mybatisplus.core.toolkit.ObjectUtils;

/**
 * 
 * 获取容器Bean方法
 * 
 * @ClassName: SpringUtils
 * @Description: TODO
 * @author Gaokui
 * @date 2023-10-24 02:00:43
 */
@Component
public class SpringBeanUtils implements ApplicationContextAware {

	private static ApplicationContext applicationContext;

	/**
	 * 
	 * 初始化上下文环境对象
	 * 实现ApplicationContextAware接口，spring容器初始化的时候，会自动的将ApplicationContext注入进来
	 * 
	 * @MethodName: setApplicationContext
	 * @Description: TODO
	 * @author Gaokui
	 * @param applicationContext
	 * @throws BeansException
	 * @see org.springframework.context.ApplicationContextAware#setApplicationContext(org.springframework.context.ApplicationContext)
	 * @date 2023-10-24 02:12:23
	 */
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		if (ObjectUtils.isEmpty(applicationContext)) {
			throw new ApplicationContextException("applicationContext must not be null");
		}
		SpringBeanUtils.applicationContext = applicationContext;
	}

	/**
	 * 
	 * 获取ApplicationContext
	 * 
	 * @MethodName: getApplicationContext
	 * @Description: TODO
	 * @author Gaokui
	 * @return ApplicationContext
	 * @date 2023-10-24 02:03:28
	 */
	public static ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	/**
	 * 
	 * 根据bean's name获取bean
	 * 
	 * @MethodName: getBean
	 * @Description: TODO
	 * @author Gaokui
	 * @param name
	 * @return Object
	 * @date 2023-10-24 02:07:05
	 */
	public static Object getBean(String name) {
		return getApplicationContext().getBean(name);
	}

	/**
	 * 
	 * 根据bean's class获取bean
	 * 
	 * @MethodName: getBean
	 * @Description: TODO
	 * @author Gaokui
	 * @param <T>
	 * @param calzz
	 * @return T
	 * @date 2023-10-24 02:09:21
	 */
	public static <T> T getBean(Class<T> calzz) {
		return getApplicationContext().getBean(calzz);
	}

	/**
	 * 
	 * 根据bean's name、class获取bean
	 * 
	 * @MethodName: getBean
	 * @Description: TODO
	 * @author Gaokui
	 * @param <T>
	 * @param name
	 * @param clazz
	 * @return T
	 * @date 2023-10-24 02:10:46
	 */
	public static <T> T getBean(String name, Class<T> clazz) {
		return getApplicationContext().getBean(name, clazz);
	}
}
