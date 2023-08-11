package cn.xiaolin.core.domain.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author xingxiaolin xlxing@bupt.edu.cn
 * @Description
 * @create 2023/7/30
 */
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class ResourceReqDto {
    @JsonSerialize(using = ToStringSerializer.class)
    @JsonDeserialize(using = NumberDeserializers.LongDeserializer.class)
    private Long id;

    /**
     * 资源名称
     */
    private String name;

    /**
     * 摘要算法md5值;判断数据库中是否已经存在，避免重复上传
     */
    private String md5;

    /**
     * MP4资源地址
     */
    private String rawFilePath;

    /**
     * HLS资源
     */
    private String m3u8;

    /**
     * DASH资源
     */
    private String mpd;
}
