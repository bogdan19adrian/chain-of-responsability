import com.bogdanenache.processing.FileProcessingOrchestrator;
import com.bogdanenache.resource.ProcessingFileClient;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class FileProcessingOrchestratorTest {

    @InjectMocks
    FileProcessingOrchestrator fileProcessingOrchestrator;

    @Test
    @DisplayName("Run through oll chain and print logs")
    void runClean(){
        final String bucketName = "bucketName";
        final String fileName = "fileName";
        final ProcessingFileClient file = new ProcessingFileClient();
        file.setBucketName(bucketName);
        file.setFileName(fileName);

        fileProcessingOrchestrator.process("", "", file);

        assertEquals(bucketName, file.getBucketName());
        assertEquals(fileName, file.getFileName());
    }
}
