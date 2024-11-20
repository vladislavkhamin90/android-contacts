package ru.yandex.practicum.contacts.presentation.base;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.DiffUtil;

public class BaseListDiffCallback<T extends ListDiffInterface<T>> extends DiffUtil.ItemCallback<T> {
    @Override
    public boolean areItemsTheSame(@NonNull T oldItem, @NonNull T newItem) {
        return this.hashCode() == newItem.hashCode();
    }

    @Override
    public boolean areContentsTheSame(@NonNull T oldItem, @NonNull T newItem) {
        return oldItem.equals(newItem);
    }

    @Override
    @Nullable
    public Object getChangePayload(@NonNull T oldItem, @NonNull T newItem) {
        return newItem;
    }
}
/*
*Немного не понял требование в последнем ревью касательно этого пункта:
*1. Выполнение требований задания:
   ✅❌ Создан дженерик-класс BaseListDiffCallback с реализацией
 *
* Класс BaseListDiffCallback создан и реализован в классах
* FilterContactTypeAdapter
* ContactAdapter
* SortTypeAdapter
* как в задании. После всех исправлений приложение компилируется, контакты сортируются и фильтруются.
* Прошу указать гду допустил ошибку. Заранее спасибо.
*
* */