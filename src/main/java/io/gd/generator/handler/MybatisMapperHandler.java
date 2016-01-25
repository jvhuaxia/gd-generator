package io.gd.generator.handler;

import java.io.File;

import io.gd.generator.context.MybatisContext;
import io.gd.generator.meta.mybatis.mapper.MybatisMapperMeta;

public class MybatisMapperHandler extends AbstractHandler<MybatisMapperMeta, MybatisContext> {

	@Override
	void preRead(MybatisContext context) throws Exception {
		File mapperFile = new File(context + File.pathSeparator + context.getEntityClass().getSimpleName() + "Mapper.java");
		System.out.println(1);
	
	}

	@Override
	MybatisMapperMeta read(MybatisContext context) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	MybatisMapperMeta parse(MybatisContext context) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	MybatisMapperMeta merge(MybatisMapperMeta parsed, MybatisMapperMeta read, MybatisContext context) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	void write(MybatisMapperMeta merged, MybatisContext context) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	void postWrite(MybatisContext context) throws Exception {
		// TODO Auto-generated method stub

	}

}
