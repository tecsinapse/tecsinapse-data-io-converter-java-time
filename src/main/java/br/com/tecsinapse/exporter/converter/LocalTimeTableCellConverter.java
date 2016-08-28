/*
 * Tecsinapse Data Importer and Exporter
 *
 * License: GNU Lesser General Public License (LGPL), version 3 or later
 * See the LICENSE file in the root directory or <http://www.gnu.org/licenses/lgpl-3.0.html>.
 */
package br.com.tecsinapse.exporter.converter;

import java.time.LocalTime;
import java.util.Date;

import com.google.common.base.Strings;

public class LocalTimeTableCellConverter implements FromDateConverter<LocalTime> {

    @Override
    public LocalTime apply(Date input) {
        return LocalDateTimeTableCellConverter.LOCAL_DATE_TIME_CONVERTER.apply(input).toLocalTime();
    }

    @Override
    public LocalTime apply(String input) {
        return Strings.isNullOrEmpty(input) ? null : LocalTime.parse(input);
    }

}
