package com.github.hairless.plink.common.builder;

import com.github.hairless.plink.model.common.FlinkSubmitOptions;
import com.github.hairless.plink.model.dto.JobInstanceDTO;

/**
 * @author: silence
 * @date: 2020/10/13
 */
public interface FlinkSubmitOptionsBuilder {
    FlinkSubmitOptions builder(JobInstanceDTO jobInstanceDTO);
}
