package com.android.ranit.cookflix.domain.usecase

import com.android.ranit.cookflix.data.model.response.IngredientsResponse
import com.android.ranit.cookflix.data.utils.Resource
import com.android.ranit.cookflix.domain.repository.CookflixRepository

class GetIngredientsUseCase(private val cookflixRepository: CookflixRepository) {
    suspend fun execute(): Resource<IngredientsResponse> {
        return cookflixRepository.getIngredients()
    }
}