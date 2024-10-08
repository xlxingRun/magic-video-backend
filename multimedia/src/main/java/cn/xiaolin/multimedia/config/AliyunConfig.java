package cn.xiaolin.multimedia.config;

import com.alibaba.cloud.spring.boot.oss.env.OssProperties;
import com.aliyun.oss.ClientBuilderConfiguration;
import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.common.auth.CredentialsProviderFactory;
import com.aliyun.oss.common.auth.EnvironmentVariableCredentialsProvider;
import com.aliyuncs.exceptions.ClientException;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author xingxiaolin xing.xiaolin@foxmail.com
 * @Description 阿里云相关配置文件
 * @create 2023/7/23
 */
@Configuration
public class AliyunConfig {

    @Bean
    public OSS ossClient() throws ClientException {
        // Endpoint地域节点
        EnvironmentVariableCredentialsProvider credentialsProvider = CredentialsProviderFactory.newEnvironmentVariableCredentialsProvider();
        ClientBuilderConfiguration conf = new ClientBuilderConfiguration();
        conf.setSupportCname(false);
        return new OSSClientBuilder().build(ossProperties().getEndpoint(), credentialsProvider, conf);
    }

    @Bean
    public OssProperties ossProperties() {
        return new OssProperties();
    }
}
