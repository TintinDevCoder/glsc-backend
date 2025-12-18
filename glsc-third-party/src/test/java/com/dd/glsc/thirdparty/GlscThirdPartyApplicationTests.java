package com.dd.glsc.thirdparty;

import com.aliyun.oss.OSSClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockMultipartFile;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class GlscThirdPartyApplicationTests {
    @Autowired
    OSSClient ossClient;

    @Test
        //测试上传图片
    void testUploadImage() throws Exception {
        // 创建一个模拟的MultipartFile
        MockMultipartFile mockFile = new MockMultipartFile(
                "file",
                "test-image22.jpg",
                "image/jpeg",
                "This is a test image content".getBytes()
        );
        // 上传文件到OSS
        String bucketName = "glsc-1603980862"; // 替换为你的Bucket名称
        String objectName = "log/" + mockFile.getOriginalFilename();
        ossClient.putObject(bucketName, objectName, mockFile.getInputStream());

        // 验证文件是否上传成功
        boolean exists = ossClient.doesObjectExist(bucketName, objectName);
        assertTrue(exists, "File should exist in OSS after upload");
    }

}
