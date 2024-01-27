package service.provider

interface Provider<T> {
    fun provideList(): List<T>
}