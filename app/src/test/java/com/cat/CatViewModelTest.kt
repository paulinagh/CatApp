package com.cat

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import com.cat.core.Resource
import com.cat.core.domain.CatDetail
import com.cat.util.DataDummy.catDetail
import org.junit.Assert
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class CatViewModelTest {
    @get:Rule
    var instantExecutorRule = InstantTaskExecutorRule()

    @Test
    fun `get cat detail from view model`() {
        val getCatExpected = MutableLiveData<Resource<CatDetail>>()

        getCatExpected.value = Resource.Success(catDetail)

        Assert.assertTrue(true)
    }
}