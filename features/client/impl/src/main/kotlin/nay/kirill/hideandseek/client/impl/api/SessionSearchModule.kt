package nay.kirill.hideandseek.client.impl.api

import nay.kirill.hideandseek.client.api.SessionSearchApi
import nay.kirill.hideandseek.client.impl.presentation.Navigation
import nay.kirill.hideandseek.client.impl.presentation.timer.HideTimerConverter
import nay.kirill.hideandseek.client.impl.presentation.timer.HideTimerViewModel
import nay.kirill.hideandseek.client.impl.presentation.sessionSearch.SessionSearchStateConverter
import nay.kirill.hideandseek.client.impl.presentation.sessionSearch.SessionSearchViewModel
import nay.kirill.hideandseek.client.impl.presentation.waiting.WaitingStateConverter
import nay.kirill.hideandseek.client.impl.presentation.waiting.WaitingViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.module

val sessionSearchModule = module {
    factory<SessionSearchApi> { SessionSearchApiImpl() }
    factoryOf(::Navigation)
    viewModelOf(::SessionSearchViewModel)
    factoryOf(::SessionSearchStateConverter)

    factoryOf(::WaitingStateConverter)
    viewModel { prop ->
        WaitingViewModel(prop.get(), get(), get(), get())
    }

    factoryOf(::HideTimerConverter)
    viewModelOf(::HideTimerViewModel)
}